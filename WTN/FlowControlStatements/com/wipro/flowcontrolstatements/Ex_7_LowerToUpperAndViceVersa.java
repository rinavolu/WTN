package com.wipro.flowcontrolstatements;

public class Ex_7_LowerToUpperAndViceVersa {

	public static void main(String args[])
	{
		String str=args[0];
		char ch=str.charAt(0);
		if(ch>=65&& ch<=90)
		{
			System.out.printf("%c->%c",ch,ch+32);
		}
		else
			System.out.printf("%c->%c",ch,ch-32);
	}
	
	
}
