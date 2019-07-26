package com.yem.request;

import java.util.Date;

import com.yem.common.BaseMsgRequest;
import com.yem.response.QueryYemMemberListResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemMemberListRequest extends BaseMsgRequest<QueryYemMemberListResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=false, fixLength=14, description="会员编码")
    private Long memberCode;

	@BizData(isNotNull=false, maxLength=20, description="会员名称")
    private String memberName;

	@BizData(isNotNull=false, fixLength=11, description="会员手机号")
    private String mobile;

	@BizData(isNotNull=false, maxLength=50, description="会员微信公众号标识")
    private String openId;

	@BizData(isNotNull=false, maxLength=10, description="是否有效")
    private Boolean valid;

	@BizData(isNotNull=false, maxLength=20, description="创建时间")
    private Date createTime;

	@BizData(isNotNull=false, fixLength=14, description="创建人")
    private Long createBy;

	@BizData(isNotNull=false, maxLength=20, description="修改时间")
    private Date updateTime;

	@BizData(isNotNull=false, fixLength=14, description="修改人")
    private Long updateBy;

	@BizData(isNotNull=false, maxLength=20, description="页面大小")
    private int pageSize;

	@BizData(isNotNull=false, maxLength=20, description="页码")
    private int pageNo;

	@Override
	public Class<QueryYemMemberListResponse> responseMsgBodyClass() {
		return QueryYemMemberListResponse.class;
	}
}