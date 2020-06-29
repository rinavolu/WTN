package com.wipro.stringbuffer;
//import java.util.*;
public class PalindromeOrNot {

  public static void main(String args[]){
	//  Scanner sc=new Scanner(System.in);
	  String str1="DAD";
	  String str2="";
	  StringBuffer str1_buffer=new StringBuffer(str1);
	  str1_buffer.reverse();
	  str2=str2+str1_buffer.toString();
	  if(str2.equalsIgnoreCase(str1))
	  {
		  System.out.println("Palindrome");
	  }
	  else
	  {
		  System.out.println("Not Palindrome");
	  }
  }
}
