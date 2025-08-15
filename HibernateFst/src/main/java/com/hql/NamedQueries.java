package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.modal.Student;
import com.util.HibernateUtil;

public class NamedQueries {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactort();
		Session session = sessionFactory.openSession();
		
		//selectusingNamedquery(session);
		
		updateNamedQuery(session);
		
	}

	private static void updateNamedQuery(Session session) {
		session.beginTransaction();
		 MutationQuery query = session.createNamedMutationQuery("updatequery");
		query.setParameter(1, "Mansoor");
		query.setParameter(2,5);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	private static void selectusingNamedquery(Session session) {
		Query<Student> query = session.createNamedQuery("selectquery", Student.class);
		List<Student> list=query.list();
		System.out.println(list);
	}

}
