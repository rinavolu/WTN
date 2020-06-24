package com.wipro.Inheritance;

public class Teacher extends Persondob{
int salary;
String subject;
Teacher(String name,String dob){
	super(name,dob);
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
void displayTeacher() {
	System.out.println("Teacher details");
	System.out.println();
	displayPersondob();
	System.out.println("Salary:-"+getSalary());
	System.out.println("Teaching Subject:-"+getSubject());
	System.out.println();
}
}
