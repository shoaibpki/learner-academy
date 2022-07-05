package com.list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.database.Classes;
import com.util.*;

public class ClassList {
	
	public ClassList() {
		
	}
	static SessionFactory factory = HibernatUtil.getSessionFactory();
	
	static Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
				
	private static List<Classes> list;
	
				
	public static List<Classes> getAllClasses(){
		list  = session.createQuery("from Classes",Classes.class).getResultList();
		return list;
					
	}
}
