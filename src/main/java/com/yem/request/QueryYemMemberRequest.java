package com.yem.request;

import com.yem.response.QueryYemMemberResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemMemberRequest extends BaseMsgRequest<QueryYemMemberResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, fixLength=14,description="会员编码")
    private Long memberCode;

	@Override
	public Class<QueryYemMemberResponse> responseMsgBodyClass() {
		return QueryYemMemberResponse.class;
	}
}