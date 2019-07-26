package com.yem.entity;

import java.util.Date;

import com.yem.common.IModel;

import lombok.Data;

@Data
public class YemPermission implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 5713267162702034342L;

	private String permissionId;

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