package com.wipro.stringbuffer;

public class Xremoval {

	public static void main(String args[])
	{
		String str=args[0];
		if(str.charAt(0)=='x'||str.charAt(0)=='X' && str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='X')
		{
			System.out.println(str.substring(1,str.length()-1));
		}
		else if(str.charAt(0)=='x'||str.charAt(0)=='X')
		{
			System.out.println(str.substring(1,str.length()));
		}
		else if(str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='X')
		{
			System.out.println(str.substring(0,str.length()-1));
		}
		else
		{
		  System.out.println(str);
		}
	}
	
	
}
