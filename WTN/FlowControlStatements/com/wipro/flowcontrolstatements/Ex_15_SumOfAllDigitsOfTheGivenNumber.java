package com.wipro.flowcontrolstatements;

public class Ex_15_SumOfAllDigitsOfTheGivenNumber {

	public static void main(String args[])
	{
		Integer n=Integer.parseInt(args[0]);
	    int r,sum=0;
	    while(n!=0)
	    {
	    	r=n%10;
	    	sum=sum+r;
	    	
	    	n=n/10;
	    }
	    System.out.println(sum);
	}
	
}

