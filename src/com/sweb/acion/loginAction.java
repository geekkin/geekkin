package com.sweb.acion;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String loginF() {
		HttpServletRequest httRequest = ServletActionContext.getRequest();
		httRequest.setAttribute("welcome", "ª∂”≠ π”√struts2£¨πßœ≤ƒ„≥…π¶≈‰÷√£°");
		return SUCCESS;
	}

	public String login() {

		return SUCCESS;
	}
}
