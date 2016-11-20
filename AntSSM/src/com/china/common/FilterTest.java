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
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO �Զ����ɵķ������
		
		//�����ύ�ķ�������
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		String servletpath = servletRequest.getServletPath();
	//	System.out.println(servletpath);
		//�õ��ύ����������
		String method =  servletRequest.getMethod().toLowerCase();
		
		if(method.equals("get")){
			
			//��д������������еõ����ݵķ���
			request = new HttpServletRequestWrapper(servletRequest){
				//@Override
				/*public String getParameter(String name) {
					try {
						return new String(super.getParameter(name).getBytes("ISO-8859-1"),code);
					} catch (UnsupportedEncodingException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
						return null;
					}
				}*/
			};
		}else{
			//ִ�в���
			request.setCharacterEncoding(code);
		}
		
		response.setCharacterEncoding(code);
		
		//������������´���
		chain.doFilter(request, response);
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO �Զ����ɵķ������

		//�õ�����web.xml��filter��ı����ʽ
		 code= filterConfig.getInitParameter("EncodingType");
	}

}
