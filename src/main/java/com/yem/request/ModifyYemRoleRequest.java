package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.ModifyYemRoleResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ModifyYemRoleRequest extends BaseMsgRequest<ModifyYemRoleResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, fixLength=14, description="角色编码", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private Long roleCode;

	@BizData(isNotNull=true, fixLength=20, description="角色名称")
	private String roleName;
	
	@BizData(isNotNull=false, maxLength=1, description="是否有效", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String valid;

	@Override
	public Class<ModifyYemRoleResponse> responseMsgBodyClass() {
		return ModifyYemRoleResponse.class;
	}
}