package com.javaintro;

public class Book {
	int bookID;
	String title;
	String author;
	double price;
	double discount;
	double finalprice;

	public static void main(String[] args) {
		Book b = new Book();
		b.bookID=12;
		b.title="The God of Small Things";
		b.author="Arundhati";
		b.price=500;
		b.discount=b.price*10/100;
		b.finalprice=b.price-b.discount;
		
		System.out.println("BOOK ID:"+b.bookID);
		System.out.println("TITLE:"+b.title);
		System.out.println("AUTHOR:"+b.author);
		System.out.println("PRICE:"+b.price);
		System.out.println("DISCOUNT:"+b.discount);
		System.out.println("FINAL PRICE:"+b.finalprice);
		
		

	}

}
