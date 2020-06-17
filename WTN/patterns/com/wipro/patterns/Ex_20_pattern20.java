package com.wipro.patterns;

public class Ex_20_pattern20 {

	public static void main(String args[])
	{
		int i,n=4,j=1;
		int spaces=n+(n-2);
		for(int l=1;l<=n;l++)
		{
			
			for(int h=1;h<=spaces;h++)
				System.out.print(" ");
			spaces=spaces-2;
			for(i=l;i>=1;i--)
				{
				 System.out.print(j+" ");
				 j++;
				}
			System.out.println(" ");
			
		}
		/*
		 this program will print the following pattern
	  1  
    2 3  
  4 5 6  
7 8 9 10 
		 */
	}
	
}
