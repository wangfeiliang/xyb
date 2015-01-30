package org.zlex.spring.filter;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CsFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
       HttpServletRequest req=(HttpServletRequest) request;
       HttpServletResponse res=(HttpServletResponse) response;
       
       String line = null;
       StringBuffer jsonIn = new StringBuffer();
       //req.getReader(); 不能得到以get方式请求的参数,能得到以post方式请求的参数
       BufferedReader br=req.getReader();
       if((line=br.readLine())!=null){
    	   jsonIn.append(line);
       }
       br.close();
       System.out.println("访问参数是:"+jsonIn);
       chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		

	}

}
