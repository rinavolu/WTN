package com.wipro.patterns;

public class Ex_18_patterns18 {

	public static void main(String args[])
	{
		int i,n=4;
		int spaces=n+(n-2);
		for(int l=1;l<=n;l++)
		{
			
			for(int h=1;h<=spaces;h++)
				System.out.print(" ");
			spaces=spaces-2;
			int j=n;
			for(i=1;i<=l;i++)
				{
				 System.out.print(j+" ");
				 j--;
				}
			System.out.println(" ");
			
		}
		/*this code will print the following pattern 
		       4  
             4 3  
  		   4 3 2  
		 4 3 2 1  
		 */

	}
	
}
