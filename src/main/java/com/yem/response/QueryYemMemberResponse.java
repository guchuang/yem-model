package com.yem.response;


import com.yem.entity.YemMember;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemMemberResponse extends BaseMsgResponse{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	private YemMember yemMember;
}