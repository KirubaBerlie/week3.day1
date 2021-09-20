package org.student;

import org.department.Department;

//studentName(),studentDept(),studentId()
public class Student extends Department

{
	public void studentName(String str)
	{
		System.out.println("Student Name is "+ str);
	}
	
	public void studentDept(String str)
		{
		System.out.println("Student Department is : " + str);
		}
	public void studentId(int ID)
	{
		System.out.println("Student ID is : " + ID);
	}
	
	public void getstudentInfo(int ID)
	{
		System.out.println("Student ID is in information (only ID) : " + ID);
	}
	
	public void getStudentInfo(int ID, String name)
	{	
		System.out.println("ID and Student Name");
		System.out.println("*******************");
		System.out.println("Student ID is : " + ID);
		System.out.println("Student Name is : " + name);
	
	}
	
	public void getStudentInfo(String email, String phno)
	{
		System.out.println("Email and phone number");
		System.out.println("*******************");
		System.out.println("Student E-mail  is : " + email);
		System.out.println("Student Phone Number is : " + phno);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.studentName("Fifine");
		s1.studentId(8596);
		s1.studentDept("Communication");
		s1.collegeCode(45678);
		s1.collegeName("International college ");
		s1.collegeRank(123);
		s1.departmentName("Computer Science");
		
		
		System.out.println("-------------------------------");
		System.out.println("Overriding Methods called here");
		System.out.println("-------------------------------");
		s1.getstudentInfo(1245);
		s1.getStudentInfo(123, "Chrysolite");
		s1.getStudentInfo("abc.gamil.com", "+91 94468417412");
		
	
	}

}
