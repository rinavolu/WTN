package com.wipro.arrays;

public class Ex_12_MiddleArray {

	public static void  middleArray(int arr_a[],int a_len,int arr_b[],int b_len)
	{
		int new_array[]=new int[2];
		if(a_len==3&&b_len==3)
		{
			new_array[0]=arr_a[1];
			new_array[1]=arr_b[1];
		}
		for(int i=0;i<new_array.length;i++)
		{
			System.out.print(new_array[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int a[]= {5, 2, 9};
		int b[]= {1, 4, 5};
		middleArray(a,a.length,b,b.length);
	}
	
}
