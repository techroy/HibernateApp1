package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp1.cfg.HibernateConfiguration;
import com.hibernateapp1.model.UserBean;

public class GetTest {

	public static void main(String[] args) {

	HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
		
		SessionFactory sessionFactory = hibernateConfiguration.getSessionFactory();
		Session session = hibernateConfiguration.getSession(sessionFactory);
	
		
		UserBean userBean = (UserBean)session.get(UserBean.class,15);
		
		//System.out.println(userBean.getId());
		
		//System.out.println("-----------");
		
		System.out.println(userBean);
		
		
		
		session.close();
		sessionFactory.close();

	}

}
