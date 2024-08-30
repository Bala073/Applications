package com.evergent.corejava.libraryapplication;

import java.util.Scanner;

public class KidsUser implements LibraryUser {
	int age;
	String booktype;
	Scanner sc=new Scanner(System.in);
	public void registerAccount(int age)
	{
	   if(age<=12) {
		   System.out.println("You have successfully registered under a Kids Account");
	    }
	   else {
		   System.out.println("Sorry, Age must be less than 12 to register as a kid");
	   }
	   
	}
	public void requestBook(String booktype)
	{
		if(booktype.equalsIgnoreCase("kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			try {
				throw new LibraryAgeException("Book not valid Exception");
			}
			catch(LibraryAgeException e) {
			System.out.println("Oops, you are allowed to take only kids books");
			System.out.println("enter booktype:");
			 booktype=sc.next();
			if(booktype.equalsIgnoreCase("kids"))
			{
				System.out.println("Book Issued successfully, please return the book within 10 days");
			}
			else {
				System.out.println("oops! you have entered other than kids");
			}
			
			}
	
	}
	}

}
