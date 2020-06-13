package com.wipro.arrays;

public class Ex_1_ArraysSumAndAverage {
  
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum is :-"+sum);
		System.out.println("Average is :-"+sum/a.length);
	}
	
}
