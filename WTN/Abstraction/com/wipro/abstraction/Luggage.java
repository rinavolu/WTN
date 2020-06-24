package com.wipro.abstraction;

public class Luggage extends Compartment{

	@Override
	public String notice() {
		String notice="This compartment is only for Storing weighted Luggages only. ";
		return notice;
	}
	

}
