package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp1.cfg.HibernateConfiguration;
import com.hibernateapp1.model.UserBean;

public class MergeTest {

	public static void main(String[] args) {
		

		
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		UserBean userBean = new UserBean();

		
		userBean.setId(9);
		//userBean.setUserName("Satish");
		userBean.setUserPassword("stish123");
		
		System.out.println(userBean.hashCode());
		
		Transaction tx = session.beginTransaction();
		userBean = (UserBean)session.merge(userBean);
		
		//session.saveOrUpdate(userBean);
		
		System.out.println(userBean.hashCode());
		
		System.out.println(userBean);
		tx.commit();
		
		session.close();
		sessionFactory.close();
	
		
	}

}
