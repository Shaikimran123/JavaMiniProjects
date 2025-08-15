package com.modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		
		SessionFactory sessionFactort = HibernateUtil.getSessionFactort();
		Session session = sessionFactort.openSession();
		
		Student student=new Student("imran", 35);
		
		session.beginTransaction();
		session.persist(student);
		session.getTransaction().commit();
		session.close();
		
	}

}
