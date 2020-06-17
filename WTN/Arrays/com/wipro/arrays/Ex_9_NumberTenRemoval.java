package com.wipro.arrays;

public class Ex_9_NumberTenRemoval {

	public static void main(String args[])
	{
		int a[]= {10, 11, 10, 2};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]==10||a[i]==0)
				for(int j=i+1;j<n;j++)
				{
					if(a[j]!=10&&a[j]!=0)
					{
						a[i]=a[j];
						a[j]=0;
						break;
					}
				}
			if(a[i]==10)
				a[i]=0;
			System.out.print(a[i]+" ");
		}
	}
	
}
