package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.QueryYemPermissionResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemPermissionRequest extends BaseMsgRequest<QueryYemPermissionResponse>{


	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 8371777085862346722L;
	
	@BizData(isNotNull=true, fixLength=14,description="权限编码")
    private Long permissionCode;

	@Override
	public Class<QueryYemPermissionResponse> responseMsgBodyClass() {
		return QueryYemPermissionResponse.class;
	}
}