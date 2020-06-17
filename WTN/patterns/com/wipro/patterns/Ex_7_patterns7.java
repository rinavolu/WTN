package com.wipro.patterns;

public class Ex_7_patterns7 {

	public static void main(String args[])
	{
		int i,j,n=1;
		for(i=1;i<=4;i++)
		{
		    
			for(j=i;j>=1;j--)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println(" ");
		
		}
		/*
		 this code will print the pattern
		 1  
         2 3  
		 4 5 6  
		 7 8 9 10  
		 */
		
	}
	
	
}