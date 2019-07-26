package com.yem.common;

import com.yem.constant.Constants;

import lombok.Getter;
import lombok.Setter;

/**
 * 公共返回模型
 * date: 2019年7月8日 下午5:19:10 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
@Setter
@Getter
public class BaseMsgResponse implements IModel{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 5746962667662910579L;

	private String respCode;
	
	private String respMsg;

	public BaseMsgResponse(String respCode, String respMsg) {
		super();
		this.respCode = respCode;
		this.respMsg = respMsg;
	}

	public BaseMsgResponse() {
		super();
		this.respCode = Constants.RESP_SUC_CODE;
		this.respMsg = Constants.RESP_SUC_MSG;
	}
	
}