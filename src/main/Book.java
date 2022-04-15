package main;

public class Book {
	public String title;
	public String ISBSN;
	public String author;
	public int yearPublish;
	
	public Book(String title, String ISBN, String author, int yearPublish) {
		this.title = title;
		this.author = author;
		this.ISBSN = ISBN;
		this.yearPublish = yearPublish;
	}
}
