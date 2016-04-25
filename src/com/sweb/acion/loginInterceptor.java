package com.sweb.acion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


public class loginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5941827551472009186L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {

		System.out.println("1");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		System.out.println("2");
		// HttpSession user = ServletActionContext.getRequest().getSession();
		Object userName = session.getAttribute("username");
		System.out.println(session.getAttribute("username"));
		if (userName == null || userName == "")
			return "login";
		else
			arg0.invoke();
		return "login";
	}

}
