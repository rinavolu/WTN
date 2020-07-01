package com.wipro.exceptionHandling;

class age {
	 void checkAge(int age) throws InvalidAgeException{
		 if(age>=18&&age<=60) {
			 System.out.println("You are Eligible");
		 }
		 else
		 {
			 throw new InvalidAgeException("You should be above 18 years for eligibility");
		 }
	 }
	
}


public class VerifyAge {
public static void main(String args[]) {
	age a1=new age();
	try {
		a1.checkAge(8);
	}
	catch(InvalidAgeException e)
	{
		System.out.println(e);
	}
}
}
