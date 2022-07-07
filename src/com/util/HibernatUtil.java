// make session factory for database connectivity
package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.database.Classes;

public class HibernatUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory != null)
			return sessionFactory;
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Classes.class);
//		configuration.addAnnotatedClass(StdAssignClass.class);
		sessionFactory = configuration.buildSessionFactory();
		
		return sessionFactory;
	}
}
