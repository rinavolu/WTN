package com.wipro.arrays;

public class Ex_10_EvenOddArrangements {

	public static void main(String args[])
	{
		int a[]= {2, 2, 2};
		int b[]= new int[a.length];
		int i=0,j=0;
		int n=a.length;
		for(i=0;i<n;i++)
			if(a[i]%2==0)
				{b[j]=a[i];
				  j++;
				}
		for(i=0;i<n;i++)
			if(a[i]%2!=0)
				{
				b[j]=a[i];
				j++;
				}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}
	
	
}
