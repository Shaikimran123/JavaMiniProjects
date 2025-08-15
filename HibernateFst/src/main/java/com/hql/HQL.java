package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.modal.Student;
import com.util.HibernateUtil;

public class HQL {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactort();
		Session session = sessionFactory.openSession();
		
		//DML insert update delet 
		//use -> createMutationQuery();
		//DQL(select ) ->createSelectionQuery();
					
		//selectMeth(session);
		//printWithID(session);
		//insertmeth(session);
		//updatemeth(session);		
		//deletmeth(session);
	
	}

	private static void deletmeth(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("delete from Student where id=?1");
		query.setParameter(1, 2);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void updatemeth(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("update Student set marks=?1 where id=?2");
		query.setParameter(1, 100);
		query.setParameter(2, 3);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void insertmeth(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Insert into Student(name, marks) values(?1,?2)");		
		query.setParameter(1, "Immu");
		query.setParameter(2, 60);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void printWithID(Session session) {
		SelectionQuery<Student> query=(SelectionQuery<Student>) session.createSelectionQuery("from Student where studID=?1",Student.class);
		query.setParameter(1, 2);
		List<Student> list=query.list();
		System.out.println(list);
	}

	private static void selectMeth(Session session) {
		SelectionQuery<Student> query=(SelectionQuery<Student>) session.createSelectionQuery("select s from Student s",Student.class);
		List<Student> list=query.list();
		System.out.println(list);
	}
	
}
