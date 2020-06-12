package com.wipro.flowcontrolstatements;

public class Ex_16_FloydsFormat {
	public static void main(String args[])
	{
		Integer n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				{
				System.out.print("*");
				if(j!=i)
				System.out.print(" ");
				}
			System.out.println();
		}
	}

}
