package com.wipro.stringbuffer;

public class concatination {
	
	public static void main(String args[])
	{
		StringBuilder str1=new StringBuilder(args[0]);
		StringBuilder str2=new StringBuilder(args[1]);
		String lowerstr1=str1.toString().toLowerCase();
		String lowerstr2=str2.toString().toLowerCase();
		if(lowerstr1.charAt(lowerstr1.length()-1)==lowerstr2.charAt(0))
		System.out.println(lowerstr1.substring(0,lowerstr1.length()-1)+lowerstr2);
		else
			System.out.println(lowerstr1+" "+lowerstr2);
		
	}
	
}
