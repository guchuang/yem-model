package com.yem.entity;

import java.util.Date;

import com.yem.common.IModel;

import lombok.Data;

@Data
public class YemRolePermission implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -8230682083067928879L;

	private String rolePermissionId;

    private Long roleCode;

    private Long permissionCode;

    private Date createTime;

    private Long createBy;
}