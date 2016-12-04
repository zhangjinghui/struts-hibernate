package com.zjh.service;

import java.util.List;
import com.zjh.dao.UserDAOImpl;
import com.zjh.po.User;

public class UserServiceImpl {
	private UserDAOImpl dao=new UserDAOImpl();
	public List<User> query(){
		return dao.query();
	}
	public void del(int id){
		dao.del(id);
	}
	public void add(User user){
		dao.add(user);
	}
	public User queryById(int id){
		return dao.queryById(id);
	}
}
