package com.wipro.arrays;

public class Ex_14_BiggestOf3x3Matrix {

	public static void main(String args[])
	{
		int h=0,max=0;
		if(args.length==9)
		{
			int a[][]=new int[3][3];
			System.out.println("The given array is :");
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					{a[i][j]=Integer.valueOf(args[h]);
					if(max<a[i][j])
						max=a[i][j];
					System.out.print(a[i][j]+" ");
					h++;
					if(j==2)
					System.out.printf("\n");
					}
			System.out.println("The biggest number in the given array is "+max);
		}
		else
			System.out.printf("Please enter 9 digit number");
		
		
	}
}
