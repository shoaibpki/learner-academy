package com.list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.database.*;
import com.util.*;

public class ClassList {
	
	static SessionFactory factory = HibernatUtil.getSessionFactory();
	static Session session = factory.openSession();
	public ClassList() {
		
	}
	
//	list of all classes
	public static List<Classes> getClassList(String qry){
		List list  = session.createQuery(qry).list();
		return list;
	}
	
//	list of all teachers
	public static List<Teacher> getTeacherList(String qry){
		List list  = session.createQuery(qry).list();
		return list;
	}
	
//	list of all subjects
	public static List<Subject> getSubjectList(String qry){
		List list  = session.createQuery(qry).list();
		return list;
	}
	

}
