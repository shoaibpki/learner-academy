//return hibernate session factory
package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			StandardServiceRegistry ssr = 
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata metaData = new MetadataSources(ssr).getMetadataBuilder().build();
			
			sessionFactory = metaData.getSessionFactoryBuilder().build();
			
		} catch (Throwable th) {
			throw new ExceptionInInitializerError(th);
		}
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
