package com.yem.entity;

import java.util.Date;

import com.yem.common.IModel;

import lombok.Data;

@Data
public class YemUserRole implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -2777373879232871096L;

	private String userRoleId;

    private Long userCode;

    private Long roleCode;

    private Date createTime;

    private Long createBy;
}