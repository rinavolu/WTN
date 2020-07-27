package com.wipro.eb.entity;


public class Domestic extends Connection{


	
	public Domestic(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
	}
	public float computeBill()
	{
		int consumed=currentReading-previousReading;
		float amount=0;
		if(consumed<=50)
		{
			amount=consumed*slabs[0];
		}
		else if(consumed>50 && consumed<=100)
		{
			consumed=consumed-50;
			amount=50*slabs[0];
			amount=amount+consumed*slabs[1];
		}
		else if(consumed>100)
		{
			amount=50*slabs[0]+50*slabs[1];
			consumed=consumed-100;
			amount=amount+consumed*slabs[2];
		}
		return amount;
	}
  
}
