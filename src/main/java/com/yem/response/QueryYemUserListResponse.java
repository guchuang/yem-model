package com.yem.response;


import java.util.List;

import com.yem.entity.YemUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemUserListResponse extends BaseMsgResponse{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -3795746002441873947L;

	private int totalPage;
	
	private int pageNo;
	
	private int pageSize;
	
	private List<YemUser> yemUsers;
}