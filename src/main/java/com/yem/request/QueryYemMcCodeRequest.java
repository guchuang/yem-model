package com.yem.request;

import com.yem.response.QueryYemMcCodeResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemMcCodeRequest extends BaseMsgRequest<QueryYemMcCodeResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, maxLength=14,description="编码类型")
    private String mcCodeType;

	@Override
	public Class<QueryYemMcCodeResponse> responseMsgBodyClass() {
		return QueryYemMcCodeResponse.class;
	}
}