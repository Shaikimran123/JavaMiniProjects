package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.modal.Student;
import com.util.HibernateUtil;

public class NativeQueries {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactort();
		Session session = sessionFactory.openSession();
		
		//DML insert update delet 
		//use -> createNativeMutationQuery();
		//DQL(select ) ->createNativeQuery();
		
		//select(session);
		//selectwithID(session);
		
		//insermeth(session);
		//updatemeth(session);
		//deletmeth(session);

	}

	private static void deletmeth(Session session) {
		session.beginTransaction();
		NativeQuery<Student> query = (NativeQuery<Student>) session.createNativeMutationQuery("delete from Student where studID=?1");
		query.setParameter(1, 2);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void updatemeth(Session session) {
		session.beginTransaction();
		NativeQuery<Student> query = (NativeQuery<Student>) session.createNativeMutationQuery("update Student set marks=?1 where studId=?2");
		query.setParameter(1,90);
		query.setParameter(2, 2);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void insermeth(Session session) {
		session.beginTransaction();
		NativeQuery<Student> query = (NativeQuery<Student>) session.createNativeMutationQuery("Insert into Student(name, marks) values(?1,?2)");
		query.setParameter(1, "soor");
		query.setParameter(2, 90);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void selectwithID(Session session) {
		NativeQuery<Student> query = session.createNativeQuery("select * from student where studID=?1",Student.class);
		query.setParameter(1, 2);
		List<Student> list=query.list();
		System.out.println(list);
	}

	private static void select(Session session) {
		NativeQuery<Student> query = session.createNativeQuery("select * from student",Student.class);
		List<Student> list=query.list();
		System.out.println(list);
	}

}
