package com.xiaohe.service;

import org.springframework.transaction.annotation.Transactional;

import com.xiaohe.dao.UserDao;

@Transactional
public class UserService{
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public void add() {
		System.out.println("service_______________");
		userDao.add();
	}
	
}
