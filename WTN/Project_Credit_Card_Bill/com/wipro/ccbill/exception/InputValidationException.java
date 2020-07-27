package com.wipro.ccbill.exception;
public class InputValidationException extends Exception{
		
		public InputValidationException(){
			super();
		}
		
		public InputValidationException(String err){
			super(err);
		}
		
		@Override
		public String toString() {
			return "Invalid Input Data";
		}
}
