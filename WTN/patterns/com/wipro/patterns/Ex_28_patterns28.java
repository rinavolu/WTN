package com.wipro.patterns;

public class Ex_28_patterns28 {

	public static void main(String args[])
	{
		int i,j,n=4;
		int h=1;
		for(i=n;i>=1;i--)
		{
			for(j=n-i;j>=1;j--)
	 		System.out.print("  ");
			for(int k=i;k>=1;k--)
			{
				System.out.print(h+" ");
							h++;
			}
			System.out.println(" ");
	}
		/*this program will print the following pattern
1 2 3 4  
  5 6 7  
    8 9  
      10 
		 */
	}
}
