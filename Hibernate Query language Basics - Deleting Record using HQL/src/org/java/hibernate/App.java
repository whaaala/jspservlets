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
			session.createQuery("delete from users "
					            + "where user_id='1'").executeUpdate();

			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}
}
