package com.wipro.exceptionHandling;

public class ExceptionHandling2 {
	
	public static void main(String args[]) {
		int a[]=new int[5];
		int sum=0,average=0;
		try {
			for(int i=0;i<5;i++)
			{	a[i]=Integer.parseInt(args[i]);
			  sum=sum+a[i];
			}
			average=sum/5;
			System.out.println(average);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
