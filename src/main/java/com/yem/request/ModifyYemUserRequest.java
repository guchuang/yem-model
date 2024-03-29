package com.yem.request;

import java.util.List;

import com.yem.common.BaseMsgRequest;
import com.yem.response.ModifyYemMemberResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ModifyYemUserRequest extends BaseMsgRequest<ModifyYemMemberResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, fixLength=14, description="用户编码", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private Long userCode;

	@BizData(isNotNull=false, maxLength=20, description="会员名称")
	private String userName;

	@BizData(isNotNull=false, maxLength=50, description="密码", regexExpression=ValidatorUtils.REGEX_PASSWORD)
	private String password;

	@BizData(isNotNull=false, fixLength=14, description="门店编码", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private Long shopCode;

	@BizData(isNotNull=false, maxLength=1, description="性别", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String sex;

	@BizData(isNotNull=false, fixLength=11, description="手机号", regexExpression=ValidatorUtils.REGEX_MOBILE)
	private String mobile;

	@BizData(isNotNull=false, maxLength=500, description="邮箱", regexExpression=ValidatorUtils.REGEX_EMAIL)
	private String email;

	@BizData(isNotNull=false, maxLength=50, description="是否有效", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String valid;

	@BizData(isNotNull=false, maxLength=500, description="角色列表", supportList=true)
	private List<Long> roles;

	@Override
	public Class<ModifyYemMemberResponse> responseMsgBodyClass() {
		return ModifyYemMemberResponse.class;
	}
}