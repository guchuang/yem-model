package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.ModifyYemServerResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ModifyYemServerRequest extends BaseMsgRequest<ModifyYemServerResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, maxLength=20, description="服务编码")
	private Long serverCode;

	@BizData(isNotNull=true, maxLength=20, description="服务名称")
	private String serverName;

	@BizData(isNotNull=true, fixLength=11, description="价格")
	private String price;

	@BizData(isNotNull=false, fixLength=1, description="是否有效")
	private String valid;

	@BizData(isNotNull=false, maxLength=2000, description="备注")
	private String remark;

	@Override
	public Class<ModifyYemServerResponse> responseMsgBodyClass() {
		return ModifyYemServerResponse.class;
	}
}