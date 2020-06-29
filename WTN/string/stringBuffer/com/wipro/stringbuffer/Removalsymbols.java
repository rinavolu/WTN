package com.wipro.stringbuffer;

public class Removalsymbols {

	public static void main(String[] args) {
		int i;
		String str=args[0];
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='*'||ch=='-')
			{
				break;
			}
		}
       if(i!=0)
       {
    	   System.out.println(str.substring(0,i));
       }
	}

}
