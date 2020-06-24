package com.wipro.encapsulation;

public class Book {

	String bookName;
	Author A;
	double price;
	int qtyInStock;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getA() {
		return A;
	}
	public void setA(Author a) {
		A = a;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
}
