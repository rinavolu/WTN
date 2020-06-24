package com.wipro.abstraction;
import java.lang.Math;
public class TestCompartment {

	public static void main(String args[])
	{
		/*
		 For this program the linked java files are 
		 Compartment.java
		 FirstClass.java
		 Ladies.java
		 General.java
		 Luggage.java
		 * */
		int min=1;
		int max=4;
		int random_number;
		Compartment c[]=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			random_number=(int)(Math.random()*(max+min-1)+min);
			if(random_number==1)
			{
				c[i]=new Luggage();
			}
			if(random_number==2)
			{
				c[i]=new Ladies();
				
			}
			if(random_number==3)
			{
				c[i]=new FirstClass();
			}
			if(random_number==4)
			{
				c[i]=new General();
			}
			System.out.println(c[i].notice());
		}
	}
	
}
