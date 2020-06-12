package com.wipro.flowcontrolstatements;

public class Ex_13_PrimeNumbersBetween_10_99 {

	public static void main(String args[])
	{
		int i;
		for(i=10;i<=99;i++)
		{
			int count=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i %j ==0)
					count=count+1;
			}
			if(count==1)
				System.out.printf("The number %d is a Prime Number\n",i);
		}
	}
}
