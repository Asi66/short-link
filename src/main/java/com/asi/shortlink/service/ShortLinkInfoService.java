package com.asi.shortlink.service;

import com.asi.shortlink.controller.request.AddShortLinkRequest;

public interface ShortLinkInfoService {

    /**
     * 新增短链信息
     * @param addShortLinkRequest
     */
    void add(AddShortLinkRequest addShortLinkRequest);
}
