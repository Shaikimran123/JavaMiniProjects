package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.modal2.Order;
import com.modal2.Person;
import com.util.HibernateUtil;

public class OneToManyMapping {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactort();
		Session session = sessionFactory.openSession();
		
		//insertMeth(session);	
		//selectmeth(session);
		//updateMeth(session);
		
	}

	private static void updateMeth(Session session) {
		session.beginTransaction();
		Person person = session.find(Person.class, 4);
		person.setName("ShaikIMRAN");
		
		List<Order> orders = person.getOrder();
		Order order = orders.get(0);
		order.setProductName("Asus_ViviBook");
		
		session.merge(person);
		session.getTransaction().commit();
		session.close();
	}

	private static void selectmeth(Session session) {
		Person person = session.find(Person.class, 4);
		System.out.println(person);
		System.out.println(person.getOrder());
	}

	private static void insertMeth(Session session) {
		Person person=new Person("Imran", "1234567890");
		Order order1=new Order(1,"mobile", 1);
		Order order2=new Order(2,"laptop",1);
		
		order1.setPerson(person);
		order2.setPerson(person);
		
		List<Order> orders=new ArrayList<Order>();
		
		orders.add(order1);
		orders.add(order2);

		person.setOrder(orders);
		
		session.beginTransaction();
		session.persist(person);
		session.getTransaction().commit();
		session.close();
	}

	
	
}
