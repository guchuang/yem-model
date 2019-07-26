package com.yem.dto;

import java.util.Date;

import com.yem.common.Page;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class YemUserDTO extends Page{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 4974882566681776806L;

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