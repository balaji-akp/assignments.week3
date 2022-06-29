package org.student;

import org.college.College;

public class Student extends College{

	public void studentName()
	{
		System.out.println("Balaji");
	}
	public void studentDept()
	{
		System.out.println("B.E CSE department");
		}
	public void studentId()
	{
		System.out.println("204884");
		
	}
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		}
}



