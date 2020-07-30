package com.wipro.list;
import java.util.*;
public class Ms2_list_problem_6 {

	public static void main(String[] args) {
		Vector<String> str=new Vector<String>();
		str.add("January");
		str.add("Febuary");
		str.add("March");
		str.add("April");
		str.add("May");
		str.add("June");
		str.add("July");
		str.add("August");
		str.add("September");
		str.add("October");
		str.add("November");
		str.add("December");
		Iterator<String> i=str.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
