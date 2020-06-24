package com.wipro.classandobjects;

public class Vital_Statistics {

	public static void main(String args[])
	{
		Patient p1= new Patient("Rahul",5.9,60.9);
		double bmi=p1.computeBMI();
		System.out.println("BMI of"+p1.patientName+" is: "+bmi);
	}
	
}
