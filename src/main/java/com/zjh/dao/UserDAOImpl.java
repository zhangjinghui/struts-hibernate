package com.zjh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zjh.po.HibernateSessionFactory;
import com.zjh.po.User;

public class UserDAOImpl {
	private Session session=null;
	public UserDAOImpl(){
		session=HibernateSessionFactory.getSessionFactory().openSession();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		HibernateSessionFactory.getSessionFactory().close();
	}
	
	
	public List<User> query(){
		return session.createQuery("from User order by id desc").list();
	}
	
	public void del(int id){
		Transaction trans=null;
		trans=session.beginTransaction();
		try {
			User u=(User)session.get(User.class, id);
			
			session.delete(u);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}
	}
	
	public void add(User user){
		Transaction trans=null;
		trans=session.beginTransaction();
		try {
			session.saveOrUpdate(user);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}
	}

	
	public User queryById(int id){
		return (User)session.get(User.class, id);
	}
}
