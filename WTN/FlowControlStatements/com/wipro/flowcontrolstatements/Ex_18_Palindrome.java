package com.wipro.flowcontrolstatements;

public class Ex_18_Palindrome {

	public static void main(String args[])
	{
		Integer n=Integer.parseInt(args[0]);
		int reverse_number=0,r,k=n;
		while(n!=0)
		{
			r=n%10;
			reverse_number=reverse_number*10+r;
			n=n/10;
		}
		if(reverse_number==k)
			System.out.println(k+" is a palindrome");
		else 
			System.out.println(k+" is not a palindrome");
	}
	
	
}
