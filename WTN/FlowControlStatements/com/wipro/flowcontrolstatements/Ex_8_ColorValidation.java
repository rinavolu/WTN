package com.wipro.flowcontrolstatements;

public class Ex_8_ColorValidation {

	public static void main(String args[])
	{
		String str=args[0];
		char ch=str.charAt(0);
		switch(ch) {
		case 'R':
			System.out.println("->Red");break;
		case 'B':
			System.out.println("->Blue");break;
		case 'G':
			System.out.println("->Orange");break;
		case 'O':
			System.out.println("->Yellow");break;
		case 'Y':
			System.out.println("->White");break;
		default:
			System.out.println("Invalid Code");break;
		}
			
	}
}
