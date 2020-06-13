package com.wipro.arrays;

public class Ex_5_2NDLargestAndSmallestArray {
	public static void main(String args[]) {
	int a[]= {5,8,9,70,78,6,8,1};
	int max_first=a[0],min_first=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max_first)
			max_first=a[i];
		if(a[i]<min_first)
			min_first=a[i];
	}
	int max_second=0,min_second=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max_second && a[i]!=max_first)
			max_second=a[i];
		if(a[i]<min_second&&a[i]!=min_first)
			min_second=a[i];
	}
	System.out.println(max_first);
	System.out.println(max_second);
	System.out.println(min_first);
	System.out.println(min_second);
}
}
