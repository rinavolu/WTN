package com.wipro.arrays;

public class Ex_2_MaxAndMinimumOfArray {

	public static void main(String args[])
	{
		int a[]= {5,8,9,70,78,6,8,1};
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Maximum:-"+max);
		System.out.println("Minimum:-"+min);
	}
	
}
