package com.wipro.classandobjects;

public class Calculator_Ex_1_objectMain {

	public static void main(String args[])
	{
		Calculator_Ex_1_class  n1 = new Calculator_Ex_1_class();
		int resultint=n1.powerInt(2, 4);
		System.out.println("Integer result is:"+resultint);
		double resultdouble=n1.powerDouble(2.8, 2);
	   System.out.println("Double result is:"+resultdouble);
	}
	
}
