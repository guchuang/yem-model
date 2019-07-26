package com.yem.response;

import com.yem.common.BaseMsgResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 添加服务响应报文
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月10日 下午2:22:34 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AddYemServerResponse extends BaseMsgResponse{
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2830513892051228141L;
	
	private Long serverCode;
}