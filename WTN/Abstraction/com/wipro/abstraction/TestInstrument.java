package com.wipro.abstraction;
import java.lang.Math;
public class TestInstrument {

	public static void main(String args[])
	{
		/*
		 For this program the linked programs are 
		 Instrument.java
		 Piano.java
		 Flute.java
		 Guitar.java
		 */
		Instrument ins[]=new Instrument[10];
		int min=1;
		int max=10;
		int random_number;
		for(int i=0;i<10;i++)
		{
			random_number=(int)(Math.random()*(max-min+1)+min);
			if(random_number==1)
			{
				ins[i]=new Piano();
			}
			if(random_number==2)
			{
				ins[i]=new Flute();
			}
			if(random_number==3)
			{
				ins[i]=new Guitar();
			}
		}
		for(int i=0;i<10;i++)
		{
			if(ins[i] instanceof Instrument)
			{
				
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
		
	}
	
	
	
}
