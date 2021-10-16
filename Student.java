package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Department d = new Department();
		d.deptName();
		d.collegeCode();
		d.collegeName();
		d.collegeRank();
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();

	}

	public void studentName() {
		System.out.println("Indhuja");

	}

	public void studentDept() {
		System.out.println("CSE");

	}

	public void studentId() {
		System.out.println("10");

	}
}