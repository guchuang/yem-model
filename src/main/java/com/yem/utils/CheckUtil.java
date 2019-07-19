
package com.yem.utils;


import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.yem.constant.Constants;
import com.yem.request.BaseMsgRequest;
import com.yem.request.QueryYemMemberRequest;
import com.yem.response.BaseMsgResponse;

import lombok.extern.slf4j.Slf4j;


/**
 * 逻辑、功能相关描述:验证对象空值，字符串零长，集合无元素
 * date: 2019年7月5日 上午10:30:17 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
@Slf4j
public class CheckUtil{
	
	public static String checkParam(String req, Object base) {
		if (!StringUtil.isEmpty(req)) {
			try {
				return BizValidate.valid(base);
			} catch (Exception e) {
				log.debug("参数校验错误");
				return Constants.RESP_PARAM_ERR_MSG;
			}
		}
		return null;
	}
	
	public static Object counvertJSONString(String json, Class classz) throws Exception {
		
		return JSONObject.parseObject(json, classz);
	}
}
