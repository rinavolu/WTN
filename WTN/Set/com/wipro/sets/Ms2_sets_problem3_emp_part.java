package com.wipro.sets;
public class Ms2_sets_problem3_emp_part implements Comparable<Ms2_sets_problem3_emp_part>{
	int emp_id;
	String emp_name;
	int salary;
	Ms2_sets_problem3_emp_part(int emp_id,String emp_name,int salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	public int compareTo(Ms2_sets_problem3_emp_part o) {
		return 1;
	}
}
