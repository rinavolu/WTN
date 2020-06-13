package com.wipro.arrays;

public class Ex_8_CalculationOfSumBetween6_7 {
	public static void main(String args[])
	{
		int a[]= {1,6,4,7,9};
		int n=a.length;
		int Index_6=0,Index_7 = 0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==6)
				Index_6=i;
			if(a[i]==7)
				Index_7=i;
		}
		if((Index_6 < Index_7))
		{
			for(int i=0;i<n;i++)
			{
				if(!(i>=Index_6&&i<=Index_7))
				sum=sum+a[i];
			}
		}
		else
		{
			for(int i=0;i<n;i++)
				sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
}
