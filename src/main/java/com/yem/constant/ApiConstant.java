package com.yem.constant;

import java.io.Serializable;

/**
 * 接口API
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月5日 上午10:34:06 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
public class ApiConstant implements Serializable {

    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -1451703706405472925L;

	public static final String YEM = "/yem";

    public static final String YEM_USER = YEM + "/user";

    public static final String YEM_ROLE = YEM + "/role";

    public static final String YEM_MENU = YEM + "/menu";

    public static final String VIEW = "/view";

    
    /**
     * 请求信息相关
     */
    public static final String API_MSG_HEADER = "requestHeader";
    
    public static final String API_MSG_BODY = "requestBody";
    
    public static final String API_MSG_SOURCE = "sourceId";
    
    public static final String API_MSG_TIME = "time";
    
    public static final String API_MSG_ACT = "act";
    
    /**
     * 请求全局上下文关键字
     */
    public static final String ROUTE_KEY= "routeContext";
    
    public static final String TOKEN_URI = "/yem/auth/oauth/token";

    public static final String AUTH_URI = "/yem/auth/oauth/authorize";
}
