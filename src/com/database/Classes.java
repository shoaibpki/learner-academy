package com.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table (name="class")
public class Classes {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="cid")
	private int classId;
	
	@Column(name="cname")
	private String className;
	
	public Classes() {}

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
