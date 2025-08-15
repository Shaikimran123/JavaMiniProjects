package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.modal.Student;
import com.modal1.Passport;
import com.modal1.User;
import com.modal2.Person;
import com.modal3.Course;
import com.modal3.Trainee;
import com.modal2.Order;

public class HibernateUtil {
	
	private static SessionFactory factory=null;
	
	public static SessionFactory getSessionFactort(){
		
		if(factory==null)
		{
			Configuration cfg=new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Passport.class);
			cfg.addAnnotatedClass(Person.class);
			cfg.addAnnotatedClass(Order.class);
			cfg.addAnnotatedClass(Course.class);
			cfg.addAnnotatedClass(Trainee.class);

			factory=cfg.buildSessionFactory();
			return factory;
		}
		return factory;
		
	}

}
