package com.sweb.acion;

import com.opensymphony.xwork2.ActionSupport;

public class usersAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2617014229785130842L;

	public String getAll() {

		System.out.println("ƒ„ﬂM»Î¡ÀuserAction");

		return "login";
	}

}
