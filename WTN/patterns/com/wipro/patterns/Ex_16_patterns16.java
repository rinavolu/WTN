package com.wipro.patterns;

public class Ex_16_patterns16 {

	public static void main(String args[])
	{
	 
		int i,n=5;
		int spaces=n+(n-2);
		int g=n;
		for(int l=1;l<=n;l++)
		{
			
			for(int h=1;h<=spaces;h++)
				System.out.print(" ");
			spaces=spaces-2;
			for(i=l;i>=1;i--)
				System.out.print(g+" ");
			g--;
			System.out.println(" ");
			
		}
		/*
		 this code will print the following pattern 
        5  
      4 4  
    3 3 3  
  2 2 2 2  
1 1 1 1 1  

		 */
		
	}
	
}
