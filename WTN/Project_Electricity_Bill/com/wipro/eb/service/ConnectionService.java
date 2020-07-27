package com.wipro.eb.service;

import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {

	public boolean validate(int currentReading,int previousReading,String type) throws InvalidReadingException,InvalidConnectionException
	{
		if(currentReading<previousReading || currentReading<0 || previousReading<0)
			throw new InvalidReadingException();
		boolean d=false;
		boolean c=false;
		boolean b=false;
		if(type.equalsIgnoreCase("Domestic"))
           d=true;
        if(type.equalsIgnoreCase("Commercial")) 
        	c=true;
        b=c||d;
        if(b==false)	
        	throw new InvalidConnectionException();
		return true;
	}
	
	public float calculateBillAmt(int currentReading,int previousReading,String type) throws InvalidReadingException, InvalidConnectionException
	{
		boolean res=true;
		try
		{
		res=validate(currentReading,previousReading,type);
		}
		catch (InvalidReadingException e)
		{
			return -1;
		}
		catch(InvalidConnectionException e)
		{
			return -2;
		}
		float amount=0;
		if(res==true)
		{
			if(type.equalsIgnoreCase("Domestic"))
			{
				Domestic d=new Domestic(previousReading,currentReading,new float[] {(float) 2.3,(float) 4.2,(float) 5.5});
				amount=d.computeBill();
			}
			else if(type.equalsIgnoreCase("Commercial"))
			{
				Commercial c=new Commercial(previousReading,currentReading,new float[] {(float) 5.2,(float) 6.8,(float) 8.3});
				amount=c.computeBill();
			}
		}
		return amount;
	}
	public String generateBill(int currentReading,int previousReading,String type) throws InvalidReadingException, InvalidConnectionException
	{
		float result=0;
		try
		{
			result=calculateBillAmt(currentReading,previousReading,type);
		}
		catch(InvalidReadingException e)
		{
			throw new InvalidReadingException();
		}
		catch(InvalidConnectionException e)
		{
	        throw new InvalidConnectionException();
		}
		if(result==-1)
			throw new InvalidReadingException();
		if(result==-2)
			throw new InvalidConnectionException();
		String answer="";
		answer=answer+"Amount to be paid:";
		answer=answer+result;
	return answer;	
	}
}
