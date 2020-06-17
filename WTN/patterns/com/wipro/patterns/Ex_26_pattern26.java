package com.wipro.patterns;

public class Ex_26_pattern26 {
	public static void main(String args[])
	{
		int i,j,n=4;
		int h=0;
		for(i=n;i>=1;i--)
		{
			h++;
			for(j=n-i;j>=1;j--)
	 		System.out.print("  ");
			for(int k=n;k>=h;k--)
			{
				System.out.print(k+" ");
							
			}
			System.out.println(" ");
	}
		/*this program will print the following pattern
4 3 2 1  
  4 3 2  
    4 3  
      4  
		 */
	}
}
