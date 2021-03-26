package org.java.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.hibernate.entity.Users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.From;

import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			session.createQuery("update users set password = 'pass123!' where first_name= 'firstName'").executeUpdate();

			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}
}
