package com.wipro.flowcontrolstatements;

public class Ex_2_OddOrEven {
   public static void main(String args[])
   {
	   int number;
	   number=Integer.parseInt(args[0]);
	   if(number%2 == 0)
		   System.out.println("Even");
	   else
		   System.out.println("Odd");
   }
	
}
