package org.student;

import org.department.Department;

public class student extends Department {
	public void studentName() {
		System.out.println("studentname");
	}
	public void studentDept() {
		System.out.println("studentdept");
	}
	public void studentId() {
		System.out.println("studentid");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student obj=new student();
obj.collegeName();
obj.collegeCode();
obj.collegeRank();
obj.deptName();
obj.studentId();
obj.studentName();
obj.studentDept();
	}

}
