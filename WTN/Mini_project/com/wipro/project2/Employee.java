package com.wipro.project2;

public class Employee {
int ID;
String Name;
int age;
float salary;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

void display() {
	System.out.println(ID+" "+Name+" "+age+" "+salary);
}

}
