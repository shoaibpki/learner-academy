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

	public static List<Classes> getAllClasses(){
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		List<Classes> list  = session.createQuery("from Classes").list();
		session.close();
		return list;
	}
}
