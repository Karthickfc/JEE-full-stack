package com.ui;

import java.util.Scanner;

import com.bean.Student;
import com.utility.College;

public class UserInterface {
	
	public static void main(String a[])
	{
		Scanner scan=new Scanner(System.in);
		College college=new College();
		System.out.println("Enter the number of student details");
		int n=scan.nextInt();
		String s="";
		System.out.println("Enter the student details");
		for (int i = 0; i < n; i++) {
			s=scan.next();
			Student student=new Student();
			student.parseData(s);
			college.addStudent(student);
		}
		System.out.println("Enter the grade");
		String grade=scan.next();
		System.out.println(college.countBasedOnGrade(grade));
		scan.close();
	}

}
