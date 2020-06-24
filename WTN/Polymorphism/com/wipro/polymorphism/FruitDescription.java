package com.wipro.polymorphism;

class Fruit{
	String name;
	String taste;
	public void eat() {
		System.out.println(name);
		System.out.println(taste);
	}
}
class Apple extends Fruit{
	Apple(){
	this.name="Apple";
	this.taste="Sweet";
	}
}
class Oranges extends Fruit{
	Oranges(){
 this.name="Oranges";
 this.taste="Sweet";
	}
}
	

public class FruitDescription {
	public static void main(String args[]) {
     Oranges O1=new Oranges(); 
     O1.eat();
     Apple A1=new Apple();
	A1.eat();
	}
}
