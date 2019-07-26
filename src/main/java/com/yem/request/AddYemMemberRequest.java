package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.AddYemMemberResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AddYemMemberRequest extends BaseMsgRequest<AddYemMemberResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, maxLength=20,description="会员名称")
	private String memberName;

	@BizData(isNotNull=true, fixLength=11,description="会员手机号")
	private String mobile;

	@BizData(isNotNull=false, maxLength=50,description="会员微信公众号标识")
	private String openId;


	@Override
	public Class<AddYemMemberResponse> responseMsgBodyClass() {
		return AddYemMemberResponse.class;
	}
}