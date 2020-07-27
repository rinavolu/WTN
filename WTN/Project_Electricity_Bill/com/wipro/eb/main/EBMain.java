package com.wipro.eb.main;

import java.util.*;

import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;
public class EBMain {

	public static void main(String[] args) throws InvalidReadingException, InvalidConnectionException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter previous month reading");
		int previousReading=sc.nextInt();
		System.out.println("Enter current month reading");
		int currentReading=sc.nextInt();
		System.out.println("Enter the type of connection");
		String type=sc.next();
		ConnectionService cs=new ConnectionService();
		String output="";
		try {
			output=cs.generateBill(currentReading, previousReading, type);
		}
		catch(InvalidReadingException e)
		{
			output=e.toString();
		}
		catch(InvalidConnectionException e)
		{
			output=e.toString();
		}
		System.out.println(output);
		//	System.out.println(cs.calculateBillAmt(currentReading, previousReading, type));
	    //	System.out.println(cs.validate(currentReading, previousReading, type));

	}

}
