package com.yem.dto;

import java.util.Date;

import com.yem.serializable.IModel;

import lombok.Data;

@Data
public class YemShop implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 7593060489367224693L;

	private String shopId;

    private Long shopCode;

    private String shopName;

    private String province;

    private String city;

    private String county;

    private String address;

    private Boolean valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}