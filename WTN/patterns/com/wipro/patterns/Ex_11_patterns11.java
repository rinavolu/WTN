package com.wipro.patterns;

public class Ex_11_patterns11 {

	public static void main(String args[])
	{
		int i,j,n;
		for(i=3;i>=1;i--)
		{
			n=1;
			for(j=1;j<=i;j++)
				{System.out.print(n+" ");
				n++;
				}
			System.out.println(" ");
		}
		/*This program will print the following pattern
		1 2 3
		1 2
		1
		 */
	}
}

