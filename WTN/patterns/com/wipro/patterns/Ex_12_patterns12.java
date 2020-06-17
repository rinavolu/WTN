package com.wipro.patterns;

public class Ex_12_patterns12 {

	public static void main(String args[])
	{
		int i,j,n;
		for(i=4;i>=1;i--)
		{
			n=4;
			for(j=1;j<=i;j++)
				{if(j==1)
				 System.out.print(n+" ");
				else
					System.out.print(n+"");
				 n--;
				}
			System.out.println(" ");
		}
		/*
		 this code will print the following pattern
		 4 321 
   		 4 32 
		 4 3 
		 4  
		 */
		
	}
	
}
