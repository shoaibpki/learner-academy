package com.list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.database.*;
import com.util.*;

public class ClassList {
	
	public ClassList() {
		
	}
	
//	add student
	public static void addStudent(Classes cls) {
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.clear();
		session.update(cls);
		tx.commit();
	}
	
//	list of all classes
	public static List<Classes> getClassList(String qry){
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		List list  = session.createQuery(qry).list();
		return list;
	}
	
//	list of all teachers
	public static List<Teacher> getTeacherList(String qry){
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		List list  = session.createQuery(qry).list();
		return list;
	}
	
//	list of all subjects
	public static List<Subject> getSubjectList(String qry){
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		List list  = session.createQuery(qry).list();
		return list;
	}
	

}
