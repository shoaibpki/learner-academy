// make session factory for database connectivity
package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernatUtil {
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			StandardServiceRegistry ssr = 
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata metaData = new MetadataSources(ssr).getMetadataBuilder().build();
			
			sessionFactory = metaData.getSessionFactoryBuilder().build();
			
		}catch (Throwable th) {
			throw new ExceptionInInitializerError(th);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
