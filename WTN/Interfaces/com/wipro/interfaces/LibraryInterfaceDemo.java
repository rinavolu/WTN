package com.wipro.interfaces;

public class LibraryInterfaceDemo {
public static void main(String args[]) {
	KidUsers k1=new KidUsers();
    k1.setAge(10);
    k1.setBookType("kids");
    k1.registerAccount();
    k1.requestBook();
    AdultUser a1=new AdultUser();
    a1.setAge(17);
    a1.setBookType("fiction");
    a1.registerAccount();
    a1.requestBook();

}
}
