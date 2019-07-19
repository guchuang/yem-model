package com.yem.request;

import com.yem.serializable.IModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseMsgHeader implements IModel{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -3598149639345046804L;
	
	private String sourceId;
	
	private String time;
	
	private String act;
}