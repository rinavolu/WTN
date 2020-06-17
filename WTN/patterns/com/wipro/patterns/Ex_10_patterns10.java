package com.wipro.patterns;

public class Ex_10_patterns10 {

	public static void main(String[] args)
	{
		int h=1;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(h+" ");
			System.out.println(" ");
			h++;
		}
		/*
		 This code will print the following pattern
		 1 1 1 1  
		 2 2 2  
		 3 3  
		 4  
		 */
	}
	
}
