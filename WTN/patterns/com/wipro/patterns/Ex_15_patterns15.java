package com.wipro.patterns;

public class Ex_15_patterns15 {

	public static void main(String args[])
	{
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
				System.out.print("  ");
			for(int h=i;h>=1;h--)
				System.out.print(i+" ");
			System.out.println(" ");
		}
		
		/*this program will print the following pattern
   1 
  22 
 333 
4444
		 */
	}
	
}
