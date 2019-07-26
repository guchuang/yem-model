package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.QueryYemUserResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemRoleRequest extends BaseMsgRequest<QueryYemUserResponse>{


	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 8371777085862346722L;
	
	@BizData(isNotNull=true, fixLength=14,description="角色编码")
    private Long roleCode;

	@Override
	public Class<QueryYemUserResponse> responseMsgBodyClass() {
		return QueryYemUserResponse.class;
	}
}