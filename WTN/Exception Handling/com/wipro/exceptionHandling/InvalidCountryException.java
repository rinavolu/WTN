package com.wipro.exceptionHandling;

public class InvalidCountryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidCountryException(String s){
		super(s);
	}
}
