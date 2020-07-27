package com.wipro.IOStreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Problem3 {

	public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input file name:-");
		String inputfilename=sc.nextLine();
		System.out.println("Enter output file");
		String outputfilename=sc.nextLine();
		BufferedReader Bread=new BufferedReader(new FileReader(inputfilename));
		BufferedWriter Bwrite=new BufferedWriter(new FileWriter(outputfilename));
		
		
		
	}
	
}
