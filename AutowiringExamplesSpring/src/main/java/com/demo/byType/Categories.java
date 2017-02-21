package com.demo.byType;

public class Categories {
	
	private String name;
	private Book book;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void show()
	{
		System.out.println(name);
		System.out.println(book.getBookName());
		System.out.println(book.getBookPrice());
	}

}
