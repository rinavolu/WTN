package com.wipro.arrays;
import java.util.Arrays;
public class Ex_5_2NDLargestAndSmallestArray {
	public static void main(String args[]) {
	int a[]= {10,20,45,50,78,99,100};
	int n=a.length;
    Arrays.sort(a);
	System.out.println("The First maximum element is:-"+a[n-1]);
	System.out.println("The Second maximum element is:-"+a[n-2]);
	System.out.println("The First minimum element is:-"+a[0]);
	System.out.println("The Second minimum element is:-"+a[1]);
}
}
