package com.yem.request;

import com.yem.response.BaseMsgResponse;
import com.yem.serializable.IModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseMsgRequest<T extends BaseMsgResponse> implements IModel{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 5746962667662910579L;

	abstract public Class<T> responseMsgBodyClass();
	
}