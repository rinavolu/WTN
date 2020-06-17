package com.wipro.patterns;

public class Ex_19_pattern19 {

	public static void main(String args[])
	{
		int i,n=9;
		int spaces=n+(n-2);
		for(int l=1;l<=n;l++)
		{
			
			for(int h=1;h<=spaces;h++)
				System.out.print(" ");
			spaces=spaces-2;
			for(i=l;i>=1;i--)
				{
				 System.out.print(i+" ");
				}
			System.out.println(" ");
			
		}
		/*this code will print the following pattern
      1  
    2 1  
  3 2 1  
4 3 2 1 
		 */
	}
	
}
