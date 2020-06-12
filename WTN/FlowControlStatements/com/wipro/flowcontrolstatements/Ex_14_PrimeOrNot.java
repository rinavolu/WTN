package com.wipro.flowcontrolstatements;

public class Ex_14_PrimeOrNot {

	public static void main(String[] args)
	{
		if(args.length>0)
		{
			Integer i=Integer.valueOf(args[0]);
			if(i==1 || i==0)
			{
				System.out.println(i+" is neither prime nor composite");
			}
			else
			{
				int count=0;
				for(int j=1;j<=i/2;j++)
				{
					if(i%j==0)
						count=count+1;
				}
				if(count==1)
					System.out.println(i+" is a prime number");
				else 
					System.out.println(i+" is not a prime number");
			}
					
		}
		else
			System.out.println("Please enter an Integer number");
	}
}
