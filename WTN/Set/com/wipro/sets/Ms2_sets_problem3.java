package com.wipro.sets;
import java.util.*;
public class Ms2_sets_problem3 {
	static TreeSet<Ms2_sets_problem3_emp_part> T1=new TreeSet<Ms2_sets_problem3_emp_part>();
	public static void main(String args[]) {
		
		Ms2_sets_problem3_emp_part e1=new Ms2_sets_problem3_emp_part(101,"Rahul",35000);
		Ms2_sets_problem3_emp_part e2=new Ms2_sets_problem3_emp_part(102,"Trump",35000);
		Ms2_sets_problem3_emp_part e3=new Ms2_sets_problem3_emp_part(103,"Clinton",35500);
		T1.add(e1);
		T1.add(e2);
		T1.add(e3);
		//reverse
		
		reverse_display(); 
		System.out.println();
		//display
		display();
		System.out.println();
		//Check The Employee
		check_item(105);
	}
	
	static void reverse_display() {
		for(Ms2_sets_problem3_emp_part i:T1.descendingSet()) {
			System.out.println(i.emp_id+" "+i.emp_name+" "+i.salary);
		}
	}
	
	static void display() {
		Iterator<Ms2_sets_problem3_emp_part> Q= T1.iterator();
		while(Q.hasNext()) {
			System.out.println(Q.next().emp_name);
		}
	}
	
	static void check_item(int id) {
		int count=0;
		for(Ms2_sets_problem3_emp_part i:T1) {
			if(i.emp_id==id) {
				System.out.println("Found!!! Employee:- "+i.emp_name);
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Employee Not Found");
		}
	}
	
	
}

