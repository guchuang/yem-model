package com.yem.request;

import com.yem.common.BaseMsgRequest;
import com.yem.response.ModifyYemPermissionResponse;
import com.yem.utils.BizData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ModifyYemPermissionRequest extends BaseMsgRequest<ModifyYemPermissionResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2127121184758649634L;

	@BizData(isNotNull=true, fixLength=14, description="权限编码")
	private Long permissionCode;
	
	@BizData(isNotNull=false, maxLength=20, description="权限名称")
	private String permissionName;

	@BizData(isNotNull=false, maxLength=50, description="权限方法")
	private String method;

	@BizData(isNotNull=false, fixLength=14, description="权限前缀地址")
	private Long zuulPerfix;

	@BizData(isNotNull=false, maxLength=1, description="服务前缀地址")
	private String serverPerfix;

	@BizData(isNotNull=false, fixLength=11, description="请求地址")
	private String uri;

	@BizData(isNotNull=false, maxLength=50, description="是否有效")
	private String valid;

	@Override
	public Class<ModifyYemPermissionResponse> responseMsgBodyClass() {
		return ModifyYemPermissionResponse.class;
	}
}