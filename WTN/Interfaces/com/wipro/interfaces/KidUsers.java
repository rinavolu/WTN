package com.wipro.interfaces;

public class KidUsers implements LibraryUser{

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
			System.out.println("You have successfully registered under a Kids Account");
		}
		if(age>12)
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}


	public void requestBook() {
		
		if(BookType.equalsIgnoreCase("Kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
