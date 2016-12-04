package com.zjh.action;

import java.util.List;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.zjh.po.User;
import com.zjh.service.UserServiceImpl;

@ParentPackage(value="struts-default")
@Results({
	@Result(name="query",location="/query.jsp"),	
	@Result(name="add",location="/add.jsp"),	
})
public class UserAction extends ActionSupport {
	private UserServiceImpl service=new UserServiceImpl();
	
	//query
	private List<User> list;
	public String query() throws Exception {
		list=service.query();
		return "query";
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
	//del
	private int id;
	public String del() throws Exception{
		service.del(id);
		return query();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//add
	public String addm() throws Exception{
		return "add";
	}
	private User user; 
	public String add() throws Exception{
		service.add(user);
		return query();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	//update
	public String querybyid() throws Exception{
		user=service.queryById(id);
		return "add";
	}
	
}
