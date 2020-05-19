package com.xiaohe.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.service.UserService;

public class UserAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("action____________");
		userService.add();
		return SUCCESS;
	}
}
