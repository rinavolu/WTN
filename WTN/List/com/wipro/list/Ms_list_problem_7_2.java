package com.wipro.list;

import java.util.Iterator;
import java.util.Vector;

public class Ms_list_problem_7_2 {
	static Vector<Ms2_list_problem_7_1> A1=new Vector<Ms2_list_problem_7_1>();
	public static void main(String[] args) {
		Ms2_list_problem_7_1 emp1=new Ms2_list_problem_7_1(101,"Rahul","rahul@email.com","Male",34000.56);
		Ms2_list_problem_7_1 emp2=new Ms2_list_problem_7_1(102,"Vamsi","vamsi@email.com","Male",36000.56);
		Ms2_list_problem_7_1 emp3=new Ms2_list_problem_7_1(103,"Ganesh","ganesh@email.com","Male",32000.56);
		
		addEmployee(emp1);
		addEmployee(emp2);
		addEmployee(emp3);
		
	deleteEmployee(102);
	showPaySlip(103);
		

	}
	   public static void addEmployee(Ms2_list_problem_7_1 A) {
		   A1.add(A);
	   }
	   
	   public static void deleteEmployee(int Id) {
		   Iterator<Ms2_list_problem_7_1> I=A1.iterator();
		   while(I.hasNext()) {
			  if( I.next().empId==Id) {
				I.remove();
				break;
			  }
		   }
	   }
		
	   public static void showPaySlip(int Id) {

		   for(Ms2_list_problem_7_1 h:A1) {
			   if(h.empId==Id) {
				   System.out.println(Id+" Salary:- "+h.salary);
			   }
		   }
	   }

}
