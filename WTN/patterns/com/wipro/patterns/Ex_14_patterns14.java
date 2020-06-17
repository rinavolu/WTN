package com.wipro.patterns;

public class Ex_14_patterns14 {

	public static void main(String args[])
	{
		int i,j,n=10;
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int h=i;h>=1;h--)
				System.out.print("*");
			System.out.println(" ");
		}
	/*
	 this program will print the following pattern
	 * //3 spaces and 1 *
	** //2 spaces and 2 *
   ***
  ****
	 */
	}
	
}
