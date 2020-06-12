package com.wipro.flowcontrolstatements;

public class Ex_17_ReverseThedigit {
	public static void main(String args[])
	{
		Integer n=Integer.parseInt(args[0]);
		int r,reverse_number=0;
		while(n!=0)
		{
			r=n%10;
			reverse_number=reverse_number*10+r;
			n=n/10;
		}
		System.out.println(reverse_number);
	}

}
