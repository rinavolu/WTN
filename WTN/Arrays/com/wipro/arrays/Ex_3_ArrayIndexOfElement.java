package com.wipro.arrays;

public class Ex_3_ArrayIndexOfElement {

	public static void main(String args[])
	{
		int a[]= {1,4,34,56,7,89,90,100};
		int i,index=-2;
		Integer search_element=Integer.parseInt(args[0]);
		for(i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				index=i;
			}
		}
		if(index==-2)
			index=-1;
		System.out.println(index);
	}
	
}
