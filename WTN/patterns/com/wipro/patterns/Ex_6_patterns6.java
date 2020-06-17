package com.wipro.patterns;

public class Ex_6_patterns6 {
	public static void main(String args[])
	{
		int i,j,n;
		for(i=1;i<=4;i++)
		{
			n=4;
			for(j=i;j>=1&&n!=0;j--)
			{	System.out.print(n+" ");
	            n--;		
	     	}
			System.out.println(" ");
		}
		/*
		 this program will print this pattern
		 4
         4 3
         4 3 2
         4 3 2 1
		 */
	}

}
