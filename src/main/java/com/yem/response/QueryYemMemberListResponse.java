package com.yem.response;


import java.util.List;

import com.yem.entity.YemMember;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemMemberListResponse extends BaseMsgResponse{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	private int totalPage;
	
	private int pageNo;
	
	private int pageSize;
	
	private List<YemMember> yemMembers;
}