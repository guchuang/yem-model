package com.yem.entity;

import java.util.Date;

import com.yem.common.IModel;

import lombok.Data;

@Data
public class YemRole implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -7860449149868434513L;

	private String roleId;

    private Long roleCode;

    private String roleName;

    private String valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}