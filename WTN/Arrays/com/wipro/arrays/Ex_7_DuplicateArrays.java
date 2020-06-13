package com.wipro.arrays;
import java.util.Arrays;
public class Ex_7_DuplicateArrays {

	public static int DuplicateElements(int a[], int n){  
	       if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (a[i] != a[i+1]){  
	                temp[j++] = a[i];  
	            }  
	         }  
	        temp[j++] = a[n-1];     
	        for (int i=0; i<j; i++){  
	            a[i] = temp[i];  
	        }  
	        return j; 
    }  
	public static void main(String args[])
	{
		  int a[] = {12,34,12,45,67,89};  
	        int length = a.length;  
	        //Arrays.sort(a);
	        length = DuplicateElements(a, length);    
	        for (int i=0; i<length; i++)  
	           System.out.print(a[i]+" "); 
	}	
}
