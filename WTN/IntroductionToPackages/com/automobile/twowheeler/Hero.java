package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

	String modelName;
	String RegistrationNumber;
	String OwnerName;
	int speed;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getRegistrationNumber() {
		return RegistrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void radio() {
		System.out.println("Change Channel Station");
	}
	public void display() {
		System.out.println("Owner Name:-"+getOwnerName());
		System.out.println("Registation Number:-"+getRegistrationNumber());
		System.out.println("Model Name:-"+getModelName());
		System.out.println("Speed:-"+getSpeed());
		
	}

}
