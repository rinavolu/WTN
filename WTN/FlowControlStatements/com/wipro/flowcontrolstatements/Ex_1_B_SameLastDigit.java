package com.wipro.flowcontrolstatements;

public class Ex_1_B_SameLastDigit {

    static boolean lastDigit(Integer a, Integer b)
	{
		int a_lastDigit=a%10;
		int b_lastDigit=b%10;
		if(a_lastDigit==b_lastDigit)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Integer a=Integer.parseInt(args[0]);
		Integer b=Integer.parseInt(args[1]);	
		System.out.println("->"+lastDigit(a,b));
		/*int a_lastDigit=a%10;
		int b_lastDigit=b%10;
		if(a_lastDigit==b_lastDigit)
		System.out.printf("LastDigit(%d,%d)->true",a,b);
		else
		System.out.printf("LastDigit(%d,%d)->false",a,b);
		*/
	}
	
}
