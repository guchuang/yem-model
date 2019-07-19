package com.yem.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.yem.serializable.IModel;

import lombok.Data;

@Data
public class YemServer implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -6666187484570199713L;

	private String serverId;

    private Long serverCode;

    private String serverName;

    private BigDecimal price;

    private String remark;

    private Boolean valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}