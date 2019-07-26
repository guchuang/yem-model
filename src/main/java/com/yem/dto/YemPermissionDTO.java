package com.yem.dto;

import java.util.Date;

import com.yem.common.Page;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class YemPermissionDTO extends Page {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 1235671833458099988L;

	private Long permissionCode;

    private String permissionName;

    private String method;

    private String zuulPrefix;

    private String serverPrefix;

    private String uri;

    private String valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

}