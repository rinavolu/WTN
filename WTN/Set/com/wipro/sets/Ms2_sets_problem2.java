package com.wipro.sets;

import java.util.HashSet;
import java.util.Iterator;

public class Ms2_sets_problem2 {

	static HashSet<String> emp_name=new HashSet<String>();
	
	static void save_employee_name(String name) {
		emp_name.add(name);
	}
	
	static void display() {
		Iterator<String> i=emp_name.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void main(String args[]) {
		save_employee_name("Ravindra");
		save_employee_name("Rahul");
		save_employee_name("trump");
		
		display();
	}
	}
