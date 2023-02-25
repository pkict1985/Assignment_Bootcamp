package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name from Student");
	}
	public void studentDept() {
		System.out.println("Student Dept from Student");
	}
	public void studentId() {
		System.out.println("Student ID from Student");
	}
	public static void main(String[] args) {
		Student objStudent=new Student();
		objStudent.studentName();
		objStudent.studentDept();
		objStudent.studentId();
		
		objStudent.deptName();
		
		objStudent.collegeCode();
		objStudent.collegeName();
		objStudent.collegeRank();
	}
}
