package com.wipro.flowcontrolstatements;

public class Ex_4_Character_Max {
 public static void main(String args[])
 {
	 String str1=args[0];
	 char c_1=str1.charAt(0);
	 String str2=args[1];
	 char c_2=str2.charAt(0);
	 if(c_1 >= c_2)
		 System.out.println(str2+","+str1);
	 else
		 System.out.println(str1+","+str2);
 }
	
}
