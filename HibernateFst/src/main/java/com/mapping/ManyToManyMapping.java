package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.modal3.Course;
import com.modal3.Trainee;
import com.util.HibernateUtil;

public class ManyToManyMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactort();
		Session session = sessionFactory.openSession();
		
		//insertMeth(session);
		
		extracted(session);
		
	}

	private static void extracted(Session session) {
		session.beginTransaction();
		Trainee trainee = session.find(Trainee.class, 1);
		System.out.println(trainee);
		System.out.println(trainee.getCourse());
	}

	private static void insertMeth(Session session) {
		session.beginTransaction();
		
		List<Trainee> trainees1=new ArrayList<>();
		List<Trainee> trainees2=new ArrayList<>();
		List<Course> courses1=new ArrayList<>();
		List<Course> courses2=new ArrayList<>();
		
		Trainee t1=new Trainee("Imran");
		Trainee t2=new Trainee("Mansoor");
		Trainee t3=new Trainee("KR");
		
		trainees1.add(t1);
		trainees1.add(t2);
		trainees2.add(t3);
		
		Course c1=new Course("JFS");
		Course c2=new Course("ADV_JAVA");
		Course c3=new Course("Hibernate");
		
		courses1.add(c1);
		courses1.add(c2);
		courses2.add(c3);
		
		
		
		t1.setCourse(courses1);
		t2.setCourse(courses1);
		t3.setCourse(courses2);
		
		c1.setTrainee(trainees1);
		c2.setTrainee(trainees1);
		c3.setTrainee(trainees2);
		
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		
		session.getTransaction().commit();
		session.close();
	}

}
