package com.yem.response;


import com.yem.common.BaseMsgResponse;
import com.yem.entity.YemSubscribe;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemSubscribeResponse extends BaseMsgResponse{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -3795746002441873947L;
	
	private YemSubscribe yemSubscribe;
}