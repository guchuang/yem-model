package com.yem.request;

import java.util.Date;

import com.yem.common.BaseMsgRequest;
import com.yem.response.QueryYemMemberListResponse;
import com.yem.utils.BizData;
import com.yem.utils.ValidatorUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryYemPermissionListRequest extends BaseMsgRequest<QueryYemMemberListResponse>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2141720282873832039L;

	@BizData(isNotNull=true, fixLength=14, description="权限编码")
	private Long permissionCode;
	
	@BizData(isNotNull=false, maxLength=20, description="权限名称")
	private String permissionName;

	@BizData(isNotNull=false, maxLength=50, description="权限方法")
	private String method;

	@BizData(isNotNull=false, fixLength=14, description="权限前缀地址")
	private Long zuulPerfix;

	@BizData(isNotNull=false, maxLength=1, description="服务前缀地址")
	private String serverPerfix;

	@BizData(isNotNull=false, fixLength=11, description="请求地址")
	private String uri;

	@BizData(isNotNull=false, maxLength=50, description="是否有效")
	private String valid;
	
	@BizData(isNotNull=false, maxLength=20, description="创建时间")
    private Date createTime;

	@BizData(isNotNull=false, fixLength=14, description="创建人")
    private Long createBy;

	@BizData(isNotNull=false, maxLength=20, description="修改时间")
    private Date updateTime;

	@BizData(isNotNull=false, fixLength=14, description="修改人")
    private Long updateBy;

	@BizData(isNotNull=true, maxLength=20, description="页面大小", regexExpression=ValidatorUtils.REGEX_NUMBER)
    private int pageSize;

	@BizData(isNotNull=true, maxLength=20, description="页码", regexExpression=ValidatorUtils.REGEX_NUMBER)
    private int pageNo;

	@Override
	public Class<QueryYemMemberListResponse> responseMsgBodyClass() {
		return QueryYemMemberListResponse.class;
	}
}