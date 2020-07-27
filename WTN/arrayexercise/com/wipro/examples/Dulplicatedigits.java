package com.wipro.examples;
import java.util.*;

public class Dulplicatedigits {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:-");
		int number=sc.nextInt();
        String str=String.valueOf(number);
        StringBuilder sb=new StringBuilder(str);
        number=Integer.valueOf(sb.reverse().toString());
        int duplicatedigit=0,i=0;
		int r=number;
		if(number>0) {
		duplicatedigit=-1;
		int a[]=new int[(int)Math.log10(r)+1];
		while(r!=0) {
			a[i]=r%10;
			r=r/10;
			i++;
		}
		for(int j=0;j<a.length;j++)
		{
			for(int h=0;h<a.length-1;h++)
			{
				
				if(h!=j&&a[h]==a[h+1]) {
					duplicatedigit=a[h];
					break;
				}
				if(h!=j) {
					if(a[j]==a[h])
					{
						duplicatedigit=a[h];
						break;
					}
				}
			}
			if(duplicatedigit>-1)
			{
				break;
			}
		}
    if(duplicatedigit==-1)
    	duplicatedigit=a[0];
	}	
		System.out.println("duplicate digit:"+duplicatedigit);
		sc.close();
	}
}
