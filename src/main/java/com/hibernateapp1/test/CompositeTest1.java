package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp1.cfg.HibernateConfiguration;
import com.hibernateapp1.model.ProductBean;

public class CompositeTest1 {

	public static void main(String[] args) {
		
	HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
		
	SessionFactory sessionFactory = hibernateConfiguration.getSessionFactory();
		
	Session session = hibernateConfiguration.getSession(sessionFactory);
	
	ProductBean productBean = new ProductBean();
	productBean.setId(1);
	productBean.setName("iphone");
	ProductBean  productBean1 = (ProductBean)session.get(ProductBean.class,productBean);
	
	System.out.println(productBean1);
	
	session.close();
	sessionFactory.close();

	}

}
