package com.asi.shortlink.service.impl;

import com.asi.shortlink.controller.request.AddShortLinkRequest;
import com.asi.shortlink.entity.ShortLinkInfo;
import com.asi.shortlink.mappper.ShortLinkInfoMapper;
import com.asi.shortlink.service.ShortLinkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ShortLinkInfoServiceImpl implements ShortLinkInfoService {
    @Autowired
    private ShortLinkInfoMapper shortLinkInfoMapper;

    @Value("${link.domain}")
    private String linkDomain;

    @Override
    public void add(AddShortLinkRequest addShortLinkRequest) {
        while (true) {
            String linkCode = generateLinkCode();
            ShortLinkInfo shortLinkInfo = new ShortLinkInfo();
            shortLinkInfo.setLinkCode(linkCode);
            shortLinkInfo.setSourceUrl(addShortLinkRequest.getSourceUrl());
            String targetUrl = linkDomain + linkCode;
            shortLinkInfo.setTargetUrl(targetUrl);
            int insert = shortLinkInfoMapper.insert(shortLinkInfo);
            if (insert > 0) {
                break;
            }
        }
    }

    /**
     * 生成随机六位编码
     *
     * @return 短链编码
     */
    private String generateLinkCode() {
        StringBuilder shortUrl = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(64);
            shortUrl.append(Base64Encoder(randomNumber));
        }
        return shortUrl.toString();
    }

    /**
     * 获取随机字符
     *
     * @param number 随机位
     * @return 字符
     */
    public char Base64Encoder(int number) {
        char[] base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        return base64Chars[number];
    }
}
