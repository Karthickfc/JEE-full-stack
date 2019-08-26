package com.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Student;

public class College {
	
	private List<Student> studentlist=new ArrayList<Student>();

	public List<Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}
	
	//Add the student object into the studentList
	public void addStudent(Student studentObj){
		studentlist.add(studentObj);
	}
	//method should returns the total number students based on the grade
	public int countBasedOnGrade(String Grade){
		int count=0;
		Iterator<Student> iter=studentlist.iterator();
		while(iter.hasNext()){
			if(iter.next().getGrade().equals(Grade)){
				count++;
			}
		}
		return count;
		
	}
}
