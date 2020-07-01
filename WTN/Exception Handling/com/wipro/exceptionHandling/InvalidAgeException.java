package com.wipro.exceptionHandling;

public class InvalidAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String s){
		super(s);
	}

}
