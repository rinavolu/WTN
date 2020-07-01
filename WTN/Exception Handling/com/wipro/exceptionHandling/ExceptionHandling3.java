package com.wipro.exceptionHandling;

class Throws_exception{
	String student;
	int subj1;
	int subj2;
	int subj3;
	void student(String student,int subj1,int subj2,int subj3) {
		this.student=student;
		this.subj1=subj1;
		this.subj2=subj2;
		this.subj3=subj3;
	}
	void check() {
	if(subj1>0&&subj1<=100&&subj2>0&&subj2<=100&&subj3>0&&subj3<=100) {
		System.out.println("Student:-"+student);
		System.out.println("Average marks:-"+(subj1+subj2+subj3)/3);
	}
	else
	{
		throw new NumberFormatException("Invalid subject numbers");
	}
	}
	
}

public class ExceptionHandling3 {

	public static void main(String args[]) {
		Throws_exception t1=new Throws_exception();
		Throws_exception t2=new Throws_exception();
		try {
			t1.student("Rahul",78,99,23);
			t2.student("RAVI",89,23,1);
			t1.check();
			t2.check();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
