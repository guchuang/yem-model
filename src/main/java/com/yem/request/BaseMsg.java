package com.yem.request;

import com.alibaba.fastjson.JSONObject;
import com.yem.serializable.IModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseMsg implements IModel{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -6041413156246586269L;

	private BaseMsgHeader requestHeader;
	
	private JSONObject requestBody;
}