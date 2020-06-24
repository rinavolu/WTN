package com.wipro.polymorphism;

class Shape{
	String shape;
	void draw() {
		System.out.println("Drawing "+shape);
	}
	void erase() {
		System.out.println("Erasing "+shape);
	}
}

class Circle extends Shape{
	String shape="Circle";
	void draw() {
		System.out.println("Drawing "+shape);
	}
	void erase() {
		System.out.println("Erasing "+shape);
	}
}
class Triangle extends Circle{
	String shape="Triangle";
	void draw() {
		System.out.println("Drawing "+shape);
	}
	void erase() {
		System.out.println("Erasing "+shape);
	}
}
class Square extends Triangle{
	String shape="Square";
	void draw() {
		System.out.println("Drawing "+shape);
	}
	void erase() {
		System.out.println("Erasing "+shape);
	}
}
public class DrawAndErase {
public static void main(String args[])
{
	Shape c=new Circle();
	Shape t=new Triangle();
	Shape s=new Square();
   c.draw();
   t.erase();
   s.erase();
}
}
