package org.zlex.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 自己写的自定义拦截器，需要注册到spring容器中，必须实现这个接口HandlerInterceptor
 * pre----Handle
   pre---Handle--two
   springmvc中的具体请求。
   post---handle--two
   post----Handle
   after--completion--two
   after----completion
 * @author 
 *
 */
public class personIntercetorTwo extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("pre---Handle--two");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("post---handle--two");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("after--completion--two");
	}

	
}
