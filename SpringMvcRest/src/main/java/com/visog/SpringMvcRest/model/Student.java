package com.visog.SpringMvcRest.model;



public class Student {

	int id;
	String studentName;
	
	public Student()
	{
		
	}

	public Student(int i, String studentName) {
		super();
		this.id = i;
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

	

}
