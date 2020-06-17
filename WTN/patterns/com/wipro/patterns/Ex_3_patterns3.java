package com.wipro.patterns;

public class Ex_3_patterns3 {

	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=i;j>=1;j--)
			System.out.print(i+"");
			System.out.println("");
		}
		/* this code will print this pattern
		1
		22
		333
		4444
		 */
	}
	
}
