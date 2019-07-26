package com.yem.dto;

import java.util.Date;

import com.yem.common.Page;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class YemSubscribeDTO extends Page {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 4340328772036620706L;

	private String subscribeId;

    private Long subscribeCode;

    private Long memberCode;

    private Long serverCode;

    private Long shopCode;

    private Date subscribeTime;

    private String remark;

    private String valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}