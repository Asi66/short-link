package com.asi.shortlink.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ShortLinkInfo {

    private Long id;

    private String linkCode;

    private String sourceUrl;

    private String targetUrl;

    private Integer isDel;

    private String creator;

    private String editor;

    private Date createTime;

    private Date editTime;

    private Integer version;

}
