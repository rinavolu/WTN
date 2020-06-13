package com.wipro.arrays;

public class Ex_13_ConversionTo2DArray {

	public static void main(String args[])
	{
		int h=0;
		if(args.length==4)
		{
			int a[][]=new int[2][2];
			System.out.println("The given array is :");
			for(int i=0;i<2;i++)
				for(int j=0;j<2;j++)
					{a[i][j]=Integer.valueOf(args[h]);
					System.out.print(a[i][j]+" ");
					h++;
					if(j==args.length)
					System.out.printf("\n");
					}
			System.out.println("The reverse of the array is :");
			for(int i=1;i>=0;i--)
				{for(int j=1;j>=0;j--)
					System.out.print(a[i][j]+" ");
				  System.out.println("");
				}
		}
		else
			 System.out.printf("Please enter 4 digit number");
	}
	
}
