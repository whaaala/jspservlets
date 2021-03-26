package org.java.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.hibernate.entity.Users;
import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                  .configure("hibernate.cfg.xml")
				                  .addAnnotatedClass(Users.class)
				                  .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
