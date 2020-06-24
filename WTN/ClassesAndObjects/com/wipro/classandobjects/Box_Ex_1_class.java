package com.wipro.classandobjects;

public class Box_Ex_1_class {

     int width;
     int height;
	 int depth;
	public Box_Ex_1_class(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;		
	}
	public int volume(){
		int volume=height*depth*width;
		return volume;
	}
	
}
