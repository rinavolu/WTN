package com.wipro.patterns;

public class Ex_25_patterns25 {
	public static void main(String args[])
	{
		int i,j,n=4;
		int h=0;
		for(i=n;i>=1;i--)
		{
			h++;
			for(j=n-i;j>=1;j--)
	 		System.out.print("  ");
			for(int k=h;k<=n;k++)
			{
				System.out.print(k+" ");
							
			}
			System.out.println(" ");
	/*
	 this code will print out the following pattern
1 2 3 4  
  2 3 4  
    3 4  
      4  
	 */
	}
	}
}
