package com.wipro.patterns;

public class Ex_24_patterns24 {
	public static void main(String args[])
	{
		int i,j,n=4;
		for(i=n;i>=1;i--)
		{
			for(j=n-i;j>=1;j--)
	 		System.out.print("  ");
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
							}
			System.out.println(" ");
	}
		/*
		 this code will print the following pattern
 1 2 3 4  
  1 2 3  
    1 2  
      1 
		 */
	}
	}
