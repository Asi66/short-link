-- 短链信息
CREATE TABLE `short_link_info`
(
    `id`          bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `link_code`   varchar(16)  NOT NULL COMMENT '短链编码',
    `source_url`  varchar(255) NOT NULL COMMENT '原始链接',
    `target_url`  varchar(255) NOT NULL COMMENT '目标链接',
    `is_del`      tinyint      NOT NULL DEFAULT '0' COMMENT '标识删除，0：存在 1：删除',
    `creator`     varchar(32)  NOT NULL DEFAULT '' COMMENT '创建人',
    `editor`      varchar(32)  NOT NULL DEFAULT '' COMMENT '修改人',
    `create_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `edit_time`   datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `version`     bigint       NOT NULL DEFAULT '1' COMMENT '版本号',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uniq_link_code` (`link_code`)
) COMMENT='短链信息表';