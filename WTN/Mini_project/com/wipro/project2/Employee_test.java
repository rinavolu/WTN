package com.wipro.project2;
import java.util.*;
public class Employee_test extends Employee{

	public static void main(String[] args) {
      int i=0;
      Employee a[]=new Employee[100];
      int option;
      boolean flag=false;
      Scanner sc=new Scanner(System.in);
      while(i>-1) {
    	  System.out.println("Main Menu");
    	  System.out.println("1.Add an Employee");
    	  System.out.println("2.Display all");
    	  System.out.println("3.Exit");
    	  option=sc.nextInt();
    	  switch(option) {
    	  case 1:{
    		  a[i]=new Employee();
    		  System.out.print("Enter Employee ID:");
    		  int ID=sc.nextInt();
    		  a[i].setID(ID);  //ID assigning
    		  System.out.print("Enter Employee Name:");
    		  String Name=sc.next();
    		  a[i].setName(Name);   //name assigning
    		  System.out.print("Enter Employee Age:");
    		  int age=sc.nextInt();
    		  a[i].setAge(age);     //age assigning
    		  System.out.print("Enter Employee Salary:");
    		  float salary=sc.nextFloat();
    		  a[i].setSalary(salary);
    		  System.out.println();
    		  break;
    	  }
    	  case 2:{
    		  int j=0;
    		  System.out.println("---Report---");
    		  for(j=0;j<=i-1;j++) {
    			  a[j].display();
    		  }
    		  System.out.println("---End of Report---");
    		  System.out.println();
    		  break;
    	  }
    	  case 3:{
    		  System.out.println("Exiting the System");
    		  flag=true;
    		  System.out.println();
    		  break;
    	  }
    	  }
    	  i++;
    	  if(flag) break;
      }
    sc.close();
	}

}
