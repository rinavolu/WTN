package com.wipro.list;

public class Ms2_list_employee_1_problem2 {
	
	
	int empId;
	String empName;
	String email;
	String gender;
	double salary;
	Ms2_list_employee_1_problem2(int empId,String empName,String email,String gender,double salary) {
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}


	void getEmployeeDetails() {
		System.out.println("Employee ID:- "+empId);
		System.out.println("Employee Name:- "+empName);
		System.out.println("Employee Email:- "+email);
		System.out.println("Employee gender:- "+gender);
		System.out.println("Employee salary:- "+salary);
	}

}
