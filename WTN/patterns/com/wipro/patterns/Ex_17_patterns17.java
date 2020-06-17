package com.wipro.patterns;

public class Ex_17_patterns17 {

	public static void main(String args[])
	{
		int i,n=5;
		int spaces=n+(n-2);
		for(int l=1;l<=n;l++)
		{
			
			for(int h=1;h<=spaces;h++)
				System.out.print(" ");
			spaces=spaces-2;
			for(i=1;i<=l;i++)
				{
				 System.out.print(i+" ");
				}
			System.out.println(" ");
			
		}
		/*
		 this code will print the following pattern
	    1  
      1 2  
    1 2 3  
  1 2 3 4  
1 2 3 4 5
		 */
	}
	
}

