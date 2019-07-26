package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.ModifyYemSubscribeResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ModifyYemSubscribeRequest extends BaseMsgRequest<ModifyYemSubscribeResponse>{


	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2127121184758649634L;

	@BizData(isNotNull=true, fixLength=14, description="预约编码")
	private Long subscribeCode;

	@BizData(isNotNull=false, fixLength=14, description="会员编码")
	private Long memberCode;

	@BizData(isNotNull=false, fixLength=14, description="服务编码")
	private Long serverCode;

	@BizData(isNotNull=false, fixLength=14, description="门店编码")
	private Long shopCode;

	@BizData(isNotNull=false, maxLength=20, description="预约时间")
	private String subscribeTime;

	@BizData(isNotNull=false, maxLength=1000, description="备注")
	private String remark;
	
	@BizData(isNotNull=false, maxLength=1, description="是否有效", regexExpression=ValidatorUtils.REGEX_NUMBER)
	private String valid;

	@Override
	public Class<ModifyYemSubscribeResponse> responseMsgBodyClass() {
		return ModifyYemSubscribeResponse.class;
	}
}