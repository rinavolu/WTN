package com.wipro.abstraction;

public class BankTest {

	public static void main(String args[])
	{
		
		/*
		 LINKED JAVA FILES ARE -->
		 GeneralBank.java,
		 ICICIBack.java,
		 KotMBank.java,
		 */
		ICICIBank i=new ICICIBank();
		System.out.println("Savings Interest rate "+i.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposit interest rate"+i.getFixedDepositInterest()+"%");
		KotMBank k=new KotMBank();
		System.out.println("Savings Interest rate "+k.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposit interest rate"+k.getFixedDepositInterest()+"%");
		GeneralBank g=new KotMBank();
		System.out.println("Savings Interest rate "+g.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposit interest rate"+g.getFixedDepositInterest()+"%");
		GeneralBank h=new ICICIBank();
		System.out.println("Savings Interest rate "+h.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposit interest rate"+h.getFixedDepositInterest()+"%");
	}
	
}
