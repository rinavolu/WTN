package com.wipro.list;
import java.util.*;
public class Ms2_list_problem3 {

	public static void main(String[] args) {
		ArrayList<String> A1=new ArrayList<String>();
		A1.add("Ravindra");
		A1.add("Rahul");
		A1.add("Ravi Teja");
		A1.add("Sarath");
		A1.add("Ajay");
		Iterator<String> I=A1.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}

	}

}
