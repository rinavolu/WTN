package com.wipro.arrays;

import java.util.Scanner;

public class RotattionOfTwoDimensionalArray {
//90 degree anticlockwise rotation
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value for a N x N matirx");
	    int n=sc.nextInt();
	    int h=n-1;
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			h=n-1;
			for(int j=0;j<n;j++) {
				b[h][k]=a[i][j];
				h--;
			}
			k++;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		sc.close();
		}

}
