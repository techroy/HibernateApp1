package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp1.cfg.HibernateConfiguration;
import com.hibernateapp1.model.UserBean;

public class PersistTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		UserBean userBean = new UserBean();

		userBean.setId(5);
		userBean.setUserName("Sam");
		userBean.setUserPassword("Sam123");

		Transaction tx = session.beginTransaction();
		session.persist(userBean);
		tx.commit();
		
		session.close();
		
		sessionFactory.close();
		

	}

}
