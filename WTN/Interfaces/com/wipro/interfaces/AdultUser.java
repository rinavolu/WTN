package com.wipro.interfaces;

public class AdultUser implements LibraryUser{

	int age;
	String BookType;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return BookType;
	}
	public void setBookType(String bookType) {
		BookType = bookType;
	}
	public void registerAccount() {
	if(age<12)
	{
		System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
	else {
		System.out.println("You have successfully registered under an Adult Account");
	}
	}
	
	public void requestBook() {
		
		if(BookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
	
}
