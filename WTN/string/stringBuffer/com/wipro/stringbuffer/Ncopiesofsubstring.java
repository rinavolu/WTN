package com.wipro.stringbuffer;

public class Ncopiesofsubstring {
	
	public static String nsubstring(String str)
	{
		String main_str="";
		String str2=str.substring(0,2);
		for(int i=0;i<str.length();i++)
		{
			main_str=main_str+str2;
		}
		return main_str;
	}
	
	public static void main(String args[])
	{
		String str1=args[0];
		System.out.println(nsubstring(str1));
	}
	

}
