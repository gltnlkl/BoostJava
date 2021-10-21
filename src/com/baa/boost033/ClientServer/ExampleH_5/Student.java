package com.baa.boost033.ClientServer.ExampleH_5;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String studentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	protected Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}
	
}
