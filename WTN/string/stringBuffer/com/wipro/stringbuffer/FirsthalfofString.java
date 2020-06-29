package com.wipro.stringbuffer;

public class FirsthalfofString {

	public static void main(String args[]) {
		String str=args[0];
		if(str.length()%2==0)
		{
			System.out.println(str.substring(0,str.length()/2));
		}
		else
		{
			System.out.println("null");
		}
		
	}
	
}
