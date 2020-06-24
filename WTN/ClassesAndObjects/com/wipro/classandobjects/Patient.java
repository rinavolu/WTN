package com.wipro.classandobjects;

public class Patient {

	String patientName;
	double height;
	double weight;
	public Patient(String name,double height,double weight) {
	this.height=height;
	this.patientName=name;
	this.weight=weight;
	}
	public double computeBMI() {
		return weight/((height*height));
	}
	
	
}
