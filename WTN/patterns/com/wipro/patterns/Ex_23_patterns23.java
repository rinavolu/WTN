package com.wipro.patterns;

public class Ex_23_patterns23 {
	public static void main(String[] args) {
		int i,j,n=4;
		for(i=n;i>=1;i--)
		{
			for(j=n-i;j>=1;j--)
	 		System.out.print("  ");
			for(int k=i;k>=1;k--)
			{
				System.out.print(i+" ");
							}
			System.out.println(" ");
		}
/*this code will print the following pattern
4 4 4 4  
  3 3 3  
    2 2  
      1 
 */
	}
	
}
