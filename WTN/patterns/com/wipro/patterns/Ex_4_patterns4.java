package com.wipro.patterns;

public class Ex_4_patterns4 {

	public static void main(String args[])
	{
		int i,j,n=4;
		int h=n;
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
				System.out.print(h+" ");
			h--;
			System.out.println("");
		}
		
		/*
		 this code will print this pattern
		4
		3 3
		2 2 2
		1 1 1 1

		 */
	}
	
}
