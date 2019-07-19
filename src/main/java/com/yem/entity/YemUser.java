package com.yem.entity;

import java.util.Date;

import com.yem.serializable.IModel;

import lombok.Data;

@Data
public class YemUser implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -3470312260939731204L;

	private String userId;

    private Long userCode;

    private String userName;

    private String password;

    private Long shopCode;

    private String sex;

    private String mobile;

    private String email;

    private String valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

}