package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.modal1.Passport;
import com.modal1.User;
import com.util.HibernateUtil;

public class OneToOneMapping {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactort();
		Session session = sessionFactory.openSession();
		
		//insertOneToOne(session);
		
		//selectOneToOne(session);
		
		//deletOneToOne(session);
		
		biDirectional(session);

		
	}

	private static void biDirectional(Session session) {
		Passport passport = session.find(Passport.class, 1000);
		System.out.println(passport);
		System.out.println(passport.getUser());
	}

	private static void deletOneToOne(Session session) {
		session.beginTransaction();
		session.remove(new User(2," ", new Passport(1000,"")));
		session.getTransaction().commit();
		session.close();
	}

	private static void selectOneToOne(Session session) {
		User user = session.find(User.class, 2);
		System.out.println(user);
	}

	private static void insertOneToOne(Session session) {
		session.beginTransaction();
		User user=new User("imran", new Passport(1001,"ATP"));
		session.persist(user);
		session.getTransaction().commit();
		session.close();
	}

}
