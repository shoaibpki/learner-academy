package com.database;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity

@Table (name="class")
public class Classes {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	@Column (name="classId")
	private int classId;
	
	@Column(name="className")
	private String className;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="classId", nullable=false)
	private List<Student> student;
 
	public Classes() {}
	
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
