package com.wipro.eb.entity;
public class Commercial extends Connection{

	public Commercial(int previousReading, int currentReading, float[] slabs) {
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
		
		if(amount>=10000)
			amount=amount+(float) (amount*0.09);
		else if(amount>=5000)
			amount=amount+(float) (amount*0.06);
		else if(amount<5000)
			amount=amount+(float) (amount*0.02);
		
		return amount;
	}
  
}
