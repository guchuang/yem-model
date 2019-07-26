package com.yem.response;


import com.yem.common.BaseMsgResponse;
import com.yem.entity.YemServer;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemServerResponse extends BaseMsgResponse{
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 4140053495273741975L;
	
	private YemServer yemServer;
}