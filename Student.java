package com.bean;

public class Student {
	private int studentid;
	private String studentName;
	private String grade;
	
	
	public int getStudentid() {
		return studentid;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	public void parseData(String details)
	{
		String[] detail=details.split(":");
		setStudentid(Integer.parseInt(detail[0]));
		setStudentName(detail[1]);
		setGrade(detail[2]);
	}
}
