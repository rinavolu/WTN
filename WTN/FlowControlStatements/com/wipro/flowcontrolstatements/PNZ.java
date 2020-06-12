package com.wipro.flowcontrolstatements;

public class PNZ {

	public static void main(String args[])
	{
		int n;
		n=Integer.parseInt(args[0]);
		if(n==0)
			System.out.println("Zero");
		else if(n>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
}
