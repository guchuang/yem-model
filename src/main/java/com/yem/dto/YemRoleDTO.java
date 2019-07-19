package com.yem.dto;

import java.util.Date;

import com.yem.entity.Page;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class YemRoleDTO extends Page{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -6123919241859426618L;

	private String roleId;

    private Long roleCode;

    private String roleName;

    private Boolean valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}