package com.wipro.Inheritance;

public class TestDetails {

	public static void main(String args[]) {
		Employee E1=new Employee();
		E1.setPerson_name("Rahul");
		E1.setAnnual_salary(1000000);
		E1.setNational_insurance_number("1573079230");
		E1.setStarted_year(2015);
		E1.display();
		Employee E2=new Employee();
		E2.setPerson_name("Krishna");
		E2.setAnnual_salary(1300000);
		E2.setNational_insurance_number("1534079230");
		E2.setStarted_year(2012);
		E2.display();
	}	
}
