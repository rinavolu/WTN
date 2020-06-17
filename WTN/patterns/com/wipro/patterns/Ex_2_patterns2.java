package com.wipro.patterns;

public class Ex_2_patterns2 {

	public static void main(String[] args)
	{
		/*this program will print this pattern
		*
		**
		***
		****
		*****
		 */
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
				System.out.print("*");
			System.out.println("");
		}
	}
	
}
