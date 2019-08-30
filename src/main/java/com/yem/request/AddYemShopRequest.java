package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.AddYemShopResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AddYemShopRequest extends BaseMsgRequest<AddYemShopResponse>{


	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2127121184758649634L;

	@BizData(isNotNull=false, maxLength=20, description="门店名称")
	private String shopName;

	@BizData(isNotNull=false, maxLength=50, description="省份")
	private String province;

	@BizData(isNotNull=false, fixLength=14, description="城市")
	private String city;

	@BizData(isNotNull=false, maxLength=1, description="区县")
	private String county;

	@BizData(isNotNull=false, fixLength=11, description="地址")
	private String address;

	@BizData(isNotNull=false, fixLength=1, description="是否有效")
	private String valid;
	
	@Override
	public Class<AddYemShopResponse> responseMsgBodyClass() {
		return AddYemShopResponse.class;
	}
}