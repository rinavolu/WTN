package com.wipro.Inheritance;

public class TestStudent {

	public static void main(String args[])
	{
		//College student details name,dob,college,ID,year
		CollegeStudent C1=new CollegeStudent("Ravindra","11-06-2000");
		C1.setCollegeName("KLU");
		C1.setStudentID(170040293);
		C1.setStudyingYear(4);
		C1.display();
	    //Student details name,dob,id,
	    Student S1=new Student("Rahul","21-06-1999");
	    S1.setStudentID(156383);
		S1.displayStudent();
		//Teacher Details
		Teacher T1=new Teacher("Ram","30-06-2000");
		T1.setSalary(600000);
		T1.setSubject("Physics");
		T1.displayTeacher();
	}
	
	
	
}
