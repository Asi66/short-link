package com.asi.shortlink;

import com.asi.shortlink.entity.ShortLinkInfo;
import com.asi.shortlink.mappper.ShortLinkInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class ShortLinkApplicationTests {

    @Autowired
    private ShortLinkInfoMapper shortLinkInfoMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<ShortLinkInfo> userList = shortLinkInfoMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}
