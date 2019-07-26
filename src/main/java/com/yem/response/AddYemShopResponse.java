package com.yem.response;

import com.yem.common.BaseMsgResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 添加会员响应报文
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
public class AddYemShopResponse extends BaseMsgResponse{
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -5633090157012476957L;
	
	private Long shopCode;
}