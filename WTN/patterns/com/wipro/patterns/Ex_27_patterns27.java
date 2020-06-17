package com.wipro.patterns;

public class Ex_27_patterns27 {

	public static void main(String args[])
	{
		int i,j,n=4;
		for(i=n;i>=1;i--)
		{
			for(j=n-i;j>=1;j--)
	 		System.out.print("  ");
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
							
			}
			System.out.println(" ");
	}
		/*
		 this program will print the following pattern
4 3 2 1  
  3 2 1  
    2 1  
      1  
		 */
	}
}
