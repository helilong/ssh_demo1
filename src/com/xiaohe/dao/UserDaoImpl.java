package com.xiaohe.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.xiaohe.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		//1 get方法：根据id查询
		User user = hibernateTemplate.get(User.class, 1);
		System.out.println(user.getUsername()+"::"+user.getAddress());
	}
	
	
}
