package com.wipro.stringbuffer;

public class NtimesThelastNcharactersofastring {

	public static void main(String[] args) {
		Integer n=Integer.parseInt(args[0]);
		String str=args[1];
		String str2=str.substring(str.length()-n,str.length());
		String str3="";
		for(int i=1;i<=n;i++)
			str3=str3+str2;
		System.out.println(str3);
	}

}
