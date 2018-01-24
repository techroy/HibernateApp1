package com.hibernateapp1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateapp1.model.UserBean;

public class LoadTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg = cfg.configure();// hibernate cfg file

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		UserBean userBean = new UserBean();

		session.load(userBean, 1);
		
		System.out.println(userBean.getId());
		
		System.out.println("---------------");
		
		System.out.println(userBean);
		
		session.close();
		factory.close();

	}

}
