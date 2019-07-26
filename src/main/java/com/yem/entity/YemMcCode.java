package com.yem.entity;

import com.yem.common.IModel;

import lombok.Data;

@Data
public class YemMcCode implements IModel {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 8759091169413040932L;

	private String mccodeId;

    private String mccodeType;

    private Long mccodePreValue;

    private Long mccodeValue;

    private Long currentValue;
}