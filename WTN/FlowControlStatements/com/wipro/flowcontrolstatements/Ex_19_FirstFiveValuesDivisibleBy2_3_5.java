package com.wipro.flowcontrolstatements;

public class Ex_19_FirstFiveValuesDivisibleBy2_3_5 {

	public static void main(String args[])
	{
		int count=5,i;
		for(i=1;count!=0;i++)
			if(i%2==0&&i%3==0&&i%5==0)
			{
				count--;
				System.out.println(i);
			}
	}
}
