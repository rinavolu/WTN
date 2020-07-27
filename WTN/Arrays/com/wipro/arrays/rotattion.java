package com.wipro.arrays;
import java.util.*;
public class rotattion {
//90degree clockwise rotation
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
	for(int i=0;i<n;i++)
	{
		int k=0;
		for(int j=0;j<n;j++) {
			b[k][h]=a[i][j];
			k++;
		}
		h--;
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
