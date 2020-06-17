package com.wipro.patterns;

public class Ex_13_patterns13 {

	public static void main(String args[])
	{
		int n=5;
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				{System.out.print(n+" ");
				n++;
				}
			System.out.println(" ");
		}
		
		/*this code will print the following pattern
		 5 6 7
		 8 9
		 10

		 */
	}
	
}
