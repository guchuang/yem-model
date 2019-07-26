package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.AddYemRoleResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AddYemRoleRequest extends BaseMsgRequest<AddYemRoleResponse>{


	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2127121184758649634L;

	@BizData(isNotNull=false, maxLength=20, description="角色名称")
	private String roleName;

	@BizData(isNotNull=false, fixLength=1, description="是否有效", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String valid;

	@Override
	public Class<AddYemRoleResponse> responseMsgBodyClass() {
		return AddYemRoleResponse.class;
	}
}