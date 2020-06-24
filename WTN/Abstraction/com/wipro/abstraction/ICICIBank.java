package com.wipro.abstraction;

public class ICICIBank extends GeneralBank{

	@Override
	public double getSavingsInterestRate() {
		
		return 4.0;
	}

	@Override
	public double getFixedDepositInterest() {
		// TODO Auto-generated method stub
		return 8.5;
	}


}
