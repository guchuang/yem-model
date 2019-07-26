package com.yem.request;

import java.util.Date;

import com.yem.common.BaseMsgRequest;
import com.yem.response.QueryYemServerListResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemServerListRequest extends BaseMsgRequest<QueryYemServerListResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=false, fixLength=14, description="服务编码")
    private Long serverCode;

	@BizData(isNotNull=false, maxLength=20, description="服务名称")
	private String serverName;

	@BizData(isNotNull=false, maxLength=50, description="价格")
	private Double price;
	
	@BizData(isNotNull=false, maxLength=50, description="是否有效", regexExpression=ValidatorUtils.REGEX_NUMBER)
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
	public Class<QueryYemServerListResponse> responseMsgBodyClass() {
		return QueryYemServerListResponse.class;
	}
}