package com.wipro.Inheritance;

public class Employee extends Person{

	
	double annual_salary;
	int started_year;
	String national_insurance_number;
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getStarted_year() {
		return started_year;
	}
	public void setStarted_year(int started_year) {
		this.started_year = started_year;
	}
	public String getNational_insurance_number() {
		return national_insurance_number;
	}
	public void setNational_insurance_number(String national_insurance_number) {
		this.national_insurance_number = national_insurance_number;
	}
	
	void display() {
		System.out.println("Employee Name:- "+getPerson_name());
		System.out.println("Started Year:- "+getStarted_year());
		System.out.println("Annual Year:- "+getAnnual_salary());
		System.out.println("National Insurance Number:- "+getNational_insurance_number());
	}
	
}
