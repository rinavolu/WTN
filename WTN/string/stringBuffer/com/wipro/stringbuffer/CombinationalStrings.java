package com.wipro.stringbuffer;

public class CombinationalStrings {

	public static void main(String[] args) {

		
		int i,j,length;
		String str1=args[0];
		String str2=args[1];
		String str3="";
		if(str1.length()>=str2.length())
			length=str2.length();
		else
			length=str1.length();
		for(i=0;i<length;i++)
		{
			char c1=str1.charAt(i);
			char c2=str2.charAt(i);
			str3=str3+c1+c2;
		}
	   if(str1.length()<str2.length()) {
		   j=str2.length()-i;
		   str3=str3+str2.substring(j+1,str2.length());
	   }
	   if(str1.length()>str2.length()) {
		   j=str1.length()-i;
		   str3=str3+str1.substring(j+1,str1.length());
	   }
	   
	   System.out.println(str3);
	}

}
