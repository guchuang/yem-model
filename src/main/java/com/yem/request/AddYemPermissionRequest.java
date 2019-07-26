package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.AddYemPermissionResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AddYemPermissionRequest extends BaseMsgRequest<AddYemPermissionResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2127121184758649634L;

	@BizData(isNotNull=false, maxLength=20, description="会员名称")
	private String permissionName;

	@BizData(isNotNull=false, maxLength=50, description="密码", regexExpression=ValidatorUtils.REGEX_PASSWORD)
	private String method;

	@BizData(isNotNull=false, fixLength=14, description="门店编码", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private Long zuulPerfix;

	@BizData(isNotNull=false, maxLength=1, description="性别", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String serverPerfix;

	@BizData(isNotNull=false, fixLength=11, description="手机号", regexExpression=ValidatorUtils.REGEX_MOBILE)
	private String uri;

	@BizData(isNotNull=false, maxLength=50, description="是否有效", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String valid;

	@Override
	public Class<AddYemPermissionResponse> responseMsgBodyClass() {
		return AddYemPermissionResponse.class;
	}
}