package com.wipro.IOStreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) throws IOException {
	 int ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Input file name");
      String inputfilename=sc.nextLine();
      System.out.println("Enter output file name");
      String outputfilename=sc.nextLine();
      BufferedReader Binput=new BufferedReader(new FileReader(inputfilename));
	  BufferedWriter Boutput=new BufferedWriter(new FileWriter(outputfilename));
	  while ((ch = Binput.read()) != -1) {
			Boutput.write(ch);
		};
	System.out.println("File is copied");
	Binput.close();
	Boutput.close();
	sc.close();
	}

}
