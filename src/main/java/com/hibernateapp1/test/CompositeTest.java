package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp1.cfg.HibernateConfiguration;
import com.hibernateapp1.model.ProductBean;

public class CompositeTest {

	public static void main(String[] args) {
		
		HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
		
		SessionFactory sessionFactory = hibernateConfiguration.getSessionFactory();
		
		Session session = hibernateConfiguration.getSession(sessionFactory);
		
		Transaction tx  = session.beginTransaction();
		
		ProductBean productBean = new ProductBean();
		
		productBean.setId(1);
		productBean.setPrice("300");
		productBean.setName("Iphone");
		
		session.save(productBean);
		
		tx.commit();
		

	}

}
