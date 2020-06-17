package com.wipro.patterns;

public class Ex_9_patterns9 {

	public static void main(String args[])
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println(" ");
		}
		
		/*
		 this code will print the following pattern
		 4 4 4 4  
		 3 3 3  
	     2 2  
		 1  

		 */
	}
	
}
