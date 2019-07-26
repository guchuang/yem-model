package com.yem.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.yem.common.IModel;

import lombok.Data;

@Data
public class YemOrder implements IModel{
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 4927577692981029719L;

	private String orderId;

    private String orderNo;

    private Long memberCode;

    private Long serverCode;

    private Long shopCode;

    private String mobile;

    private Boolean orderType;

    private Boolean paymentType;

    private BigDecimal amt;

    private BigDecimal paymentAmt;

    private BigDecimal disamt;

    private BigDecimal changeAmt;

    private String remark;

    private Boolean valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

}