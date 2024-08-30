package com.evergent.corejava.libraryapplication;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		String booktype;
		KidsUser ku=new KidsUser();
		AdultUser au=new AdultUser();
		if(age==0||age<0)
		{
		try {
			if(age<=0)
			{
				throw new LibraryAgeException("Age not valid Exception");
			}
		}
		catch(LibraryAgeException e) {
			System.out.println("enter valid age should greater than 0....");
			System.out.println("enter age:");
			 age=sc.nextInt();
			System.out.println("enter booktype:");
			booktype=sc.next();
			if(age<=12) {
				ku.registerAccount(age);
				ku.requestBook(booktype);
			}
			else {
				au.registerAccount(age);
				au.requestBook(booktype);
				
			}
		}
		}
		else if(age>0&&age<=12) {
			System.out.println("enter the booktype");
		 booktype=sc.next();
		ku.registerAccount(age);
		ku.requestBook(booktype);
		}
		else {
			System.out.println("enter the booktype");
			booktype=sc.next();
		au.registerAccount(age);
		au.requestBook(booktype);
		}


	}

}
