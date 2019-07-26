package com.yem.response;


import com.yem.common.BaseMsgResponse;
import com.yem.entity.YemPermission;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemPermissionResponse extends BaseMsgResponse{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -294914961254720914L;
	
	private YemPermission yemPermission;
}