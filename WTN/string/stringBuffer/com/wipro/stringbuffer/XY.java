package com.wipro.stringbuffer;

public class XY {

	public static void main(String[] args) {
	String str1=args[0];
	String str2=args[1];
	char c1=str2.charAt(0);
	char c2=str2.charAt(1);
	char ch_next=' ';
	String str3="";
	for(int i=0;i<str1.length()-1;i++)
	{
		char ch=str1.charAt(i);
			ch_next=str1.charAt(i+1);

		if(ch==c1&&ch_next==c2) {
		
		if(i==0) {
			str3=str3+str1.charAt(i+2);}
		else if(i==str1.length()-2)
		{
			str3=str3+str1.charAt(i-1);
		}
		else if(i!=0) {
			str3=str3+str1.charAt(i-1)+str1.charAt(i+2);
		}
		}
	}
	
	System.out.println(str3);
	
	}

}
