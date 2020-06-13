package com.wipro.arrays;
import java.util.Arrays;
public class Ex_7_DuplicateArrays {
	public static void main(String args[])
	{
		  int a[] = {12,34,12,45,67,89,12,34,56,78};  
	        int size = a.length;
	        for(int i=0;i<size;i++)
	        	for(int j=i+1;j<size;j++)
	        	{
	        		if(a[i]==a[j])
	        		{
	        			for(int k=j;k<size-1;k++)
	        			{
	        				a[k]=a[k+1];
	        			}
	        			size=size-1;
	        		}
	        	}
	        
	        for(int i=0;i<size;i++)
	        	System.out.print(a[i]+" ");
	        	
	}	
}
