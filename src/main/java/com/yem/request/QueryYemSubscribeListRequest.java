package com.yem.request;

import java.util.Date;

import com.yem.common.BaseMsgRequest;
import com.yem.response.QueryYemSubscribeListResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemSubscribeListRequest extends BaseMsgRequest<QueryYemSubscribeListResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=false, fixLength=14, description="会员编码")
	private Long subscribeCode;

	@BizData(isNotNull=false, fixLength=14, description="会员编码")
	private Long memberCode;

	@BizData(isNotNull=false, fixLength=14, description="服务编码")
	private Long serverCode;

	@BizData(isNotNull=false, fixLength=14, description="门店编码")
	private Long shopCode;

	@BizData(isNotNull=false, maxLength=20, description="预约时间")
	private String subscribeTime;

	@BizData(isNotNull=false, maxLength=1000, description="备注")
	private String remark;

	@BizData(isNotNull=false, fixLength=1, description="是否有效")
	private String valid;
	
	@BizData(isNotNull=false, maxLength=20, description="创建时间")
    private Date createTime;

	@BizData(isNotNull=false, fixLength=14, description="创建人")
    private Long createBy;

	@BizData(isNotNull=false, maxLength=20, description="修改时间")
    private Date updateTime;

	@BizData(isNotNull=false, fixLength=14, description="修改人")
    private Long updateBy;

	@BizData(isNotNull=true, maxLength=20, description="页面大小", regexExpression=ValidatorUtils.REGEX_NUMBER)
    private int pageSize;

	@BizData(isNotNull=true, maxLength=20, description="页码", regexExpression=ValidatorUtils.REGEX_NUMBER)
    private int pageNo;

	@Override
	public Class<QueryYemSubscribeListResponse> responseMsgBodyClass() {
		return QueryYemSubscribeListResponse.class;
	}
}