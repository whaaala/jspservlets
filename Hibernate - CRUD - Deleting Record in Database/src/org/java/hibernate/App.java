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
			//Users user = new Users("baba01", "pass123!", "babatunde", "eyite"); // values  to add in the db
			Users user = new Users(); // object to use in getting value from the db
			//start transaction
			session.beginTransaction();
			//Perform operation
		
			//session.save(user);  // adding values in the table in the db
			user =session.get(Users.class, 2); // get value from the db
			
			//Updating Object
			//user.setUsername("admin@admin.java");
			
			//Deleting a Record with user id
			session.delete(user);
			
			//Commit the transaction
			session.getTransaction().commit();
			//System.out.println("Row added!");
			System.out.println(user);
			
			
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
