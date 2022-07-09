<%@page import="com.database.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.list.ClassList, 
    				com.database.Classes,
    				java.util.List,
    				 java.util.Iterator"
    %>
    <%@ taglib prefix="cls" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Classes> clist = ClassList.getClassList("from Classes order by classId");
		Iterator<Classes>  itr= clist.iterator();
		
		while (itr.hasNext())
		{ 
			Classes cls = itr.next();
			out.println(cls.getClassId()+"&nbsp;&nbsp;"); 
			out.println("<b>"+cls.getClassName()+"</b><br>");
			List<Student> slist = cls.getStudent();
			Iterator<Student> itr2 = slist.iterator();
			while (itr2.hasNext())
			{
				Student std = itr2.next();
				out.print(std.getStudentId()+"&nbsp;&nbsp;");
				out.print(std.getStudentName()+"&nbsp;&nbsp;");
				out.print(std.getStudentContact()+"&nbsp;&nbsp;");
				out.print(std.getStudentAddress()+"&nbsp;&nbsp;");
				out.print(std.getAdmissionDate()+"<br>");
			}
			out.print("<br>");
		}
	%>
</body>
</html>