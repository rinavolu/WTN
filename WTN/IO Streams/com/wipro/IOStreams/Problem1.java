package com.wipro.IOStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) throws IOException {

		
		File f1;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name:-");
		String file=sc.nextLine();
        System.out.println("Enter the character to be counted");
        char ch=sc.nextLine().charAt(0);
        int count=0;
        BufferedReader B1=new BufferedReader(new FileReader(file));
        String str=B1.readLine();
        for(int i=0;i<str.length();i++) {
        	c=str.charAt(i);
        	if(c==ch) {
        		count++;
        	}
        }
		System.out.println("File "+file+" has "+count+" instances of letter "+ch);
	}

}
