package com.wipro.exceptionHandling;
import java.util.*;
public class ExceptionHandling1 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		try {
			for(int i=0;i<n;i++) {
		    a[i]=Integer.parseInt(args[i]);
		    }
			System.out.println("Enter element index to find");
			int number_index=sc.nextInt();
			System.out.println("The array element at index at "+number_index+"is:-"+a[number_index]);
            System.out.println("The array element successfully accessed.");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		sc.close();
	}
}
