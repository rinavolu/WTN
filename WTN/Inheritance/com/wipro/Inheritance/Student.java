package com.wipro.Inheritance;

public class Student extends Persondob{

	int studentID;
	Student(String person_name, String date_of_birth) {
		super(person_name, date_of_birth);
		// TODO Auto-generated constructor stub
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
    void displayStudent() {
    	System.out.println("Student details");
    	System.out.println();
    	displayPersondob();
    	System.out.println("Student ID:-"+getStudentID());
    	System.out.println();
    }
	
	
	
	
}
