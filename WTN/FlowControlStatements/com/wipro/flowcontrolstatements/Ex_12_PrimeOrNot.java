package com.wipro.flowcontrolstatements;

public class Ex_12_PrimeOrNot {

	public static void main(String args[])
	{
		int count=0,i;
		int number=Integer.parseInt(args[0]);
		for(i=1;i<=number/2;i++)
		{
			if(number%i==0)
				count=count+1;
		}
		if(count==1)
			System.out.println("This is a prime number");
		else
			System.out.println("This is not a prime number");
		
	}
	
}
