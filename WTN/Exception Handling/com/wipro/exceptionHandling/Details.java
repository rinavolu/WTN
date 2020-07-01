package com.wipro.exceptionHandling;

class user {
	void userregistration(String name,String country) throws InvalidCountryException
	{
		if(country.equalsIgnoreCase("India"))
		{
			System.out.println("registration done successfully");
		}
		else
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
	}
}

public class Details {

	public static void main(String[] args) {
		user u1=new user();
		try {
		u1.userregistration("Ravindra", "India");
		}
		catch(InvalidCountryException e) {
			System.out.println(e);
		}
	}

}
