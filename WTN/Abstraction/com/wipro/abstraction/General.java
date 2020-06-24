package com.wipro.abstraction;

public class General extends Compartment{

	@Override
	public String notice() {
		String notice="This compartment is only for General reservation persons";
		return notice;
	}

}
