package com.wipro.list;
import java.util.*;
public class Ms_list_problem4_2 {

	public static void main(String[] args) {

			Ms_list_problem4_1 a_int=new Ms_list_problem4_1(12);
			Ms_list_problem4_1 b_float=new Ms_list_problem4_1(23.7);
			Ms_list_problem4_1 c_double=new Ms_list_problem4_1(29.4098);
           ArrayList<Ms_list_problem4_1> A1=new ArrayList<Ms_list_problem4_1>();
           A1.add(a_int);
           A1.add(b_float);
           A1.add(c_double);
          System.out.println( A1.get(0).getA());
           System.out.println(A1.get(1).getB());
           System.out.println(A1.get(2).getC());
		
		
	}

}
