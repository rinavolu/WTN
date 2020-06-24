package com.wipro.Inheritance;

public class Persondob {

	String person_name;
	String date_of_birth;
    Persondob(String person_name,String date_of_birth){
    	this.person_name=person_name;
    	this.date_of_birth=date_of_birth;
    }
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
    void displayPersondob() {
    	System.out.println("Name:-"+getPerson_name());
    	System.out.println("Date of Birth:-"+getDate_of_birth());
    }
}
