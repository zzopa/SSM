package com.china.common;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class FilterTest implements Filter {
	private String code;
	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO 自动生成的方法存根
		
		//区分提交的方法类型
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		String servletpath = servletRequest.getServletPath();
	//	System.out.println(servletpath);
		//得到提交方法的类型
		String method =  servletRequest.getMethod().toLowerCase();
		
		if(method.equals("get")){
			
			//重写获得请求数据中得到数据的方法
			request = new HttpServletRequestWrapper(servletRequest){
				//@Override
				/*public String getParameter(String name) {
					try {
						return new String(super.getParameter(name).getBytes("ISO-8859-1"),code);
					} catch (UnsupportedEncodingException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
						return null;
					}
				}*/
			};
		}else{
			//执行操作
			request.setCharacterEncoding(code);
		}
		
		response.setCharacterEncoding(code);
		
		//让请求继续向下传递
		chain.doFilter(request, response);
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO 自动生成的方法存根

		//得到配置web.xml中filter里的编码格式
		 code= filterConfig.getInitParameter("EncodingType");
	}

}
