package com.wipro.encapsulation;

public class AuthorBookDetails {


	public static void main(String args[])
	{
		Author A1=new Author();
		A1.setAuthor_name("Ravindra");
		A1.setEmail("ravindranadh.inavolu@gmail.com");
		A1.setGender('M');
		Book B1=new Book();
		B1.setBookName("Everything is fine");
		B1.setPrice(589);
		B1.setQtyInStock(100);
		B1.setA(A1);
		System.out.println("Book Name"+B1.getBookName());
		System.out.println("Author name:"+B1.getA().getAuthor_name());
		System.out.println("Email: "+B1.getA().getEmail());
		System.out.println("Gender:"+B1.getA().getGender());
		System.out.println("Price of book:"+B1.getPrice());
		System.out.println("Quantity of stock:"+B1.getQtyInStock());
	}
	
}
