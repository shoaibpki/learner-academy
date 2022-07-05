// make session factory for database connectivity
package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.database.Classes;

public class HibernatUtil {
	private static SessionFactory sessionFactory;
			
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Classes.class);
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}
}
