package com.yem.enums;

import com.yem.utils.StringUtil;

/**
 * 接口类型枚举
 * date: 2019年7月11日 下午4:49:23 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
public enum ApiEnum {
   
	MEMBER_QUERY("20006040000001", "com.yem.request.QueryYemMemberRequest"),
	
	MEMBER_QUERY_LIST("20006040000002", "com.yem.request.QueryYemMemberListRequest"),

	MEMBER_ADD("20006040000003", "com.yem.request.AddYemMemberRequest"),

	MEMBER_MODIFY("20006040000004", "com.yem.request.ModifyYemMemberRequest"),

	ROLE_QUERY("20003031000001", "com.yem.request.QueryYemRoleRequest"),

	ROLE_ADD("20003031000001", "AddYemRoleRequest");
	
	
	private String code;
	
	private String type;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private ApiEnum(String code, String type) {
		this.code = code;
		this.type = type;
	}
	
	
	public static String getType(String code) {
		String type = "";
		
		if (!StringUtil.isEmpty(code)) {
			
			for (ApiEnum api : ApiEnum.values()) {
				
				if (code.equals(api.getCode())) {
					
					type = api.type;
					continue;
				}
			}
		}
		
		return type;
	}
}
