package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateapp1.model.UserBean;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();// Activates Hibernate

		cfg = cfg.configure();//
		

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		System.out.println(sessionFactory.getClass().getName());

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		UserBean userBean = new UserBean();

		userBean.setId(4);
		userBean.setUserName("Iain");
		userBean.setUserPassword("iain123");

		int id  = (Integer)session.save(userBean);//insert query
		
		System.out.println("Identity value---"+id);

		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
