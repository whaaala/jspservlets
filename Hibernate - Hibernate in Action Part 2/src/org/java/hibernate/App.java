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
			//Create object of entity class type
			Users user = new Users("username", "password", "firstName", "lastName");
			//start transaction
			session.beginTransaction();
			//Perform operation
			session.save(user);
			//Commit the transaction
			session.getTransaction().commit();
			System.out.println("Row added!");
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
