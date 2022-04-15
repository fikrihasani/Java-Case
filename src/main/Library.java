package main;

import java.util.ArrayList;

public class Library {
	public String libName;
	public ArrayList<Book> bookList;
	
	public Library(String libName) {
		this.libName = libName;
		this.bookList = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		this.bookList.add(book);
		System.out.println("Data berhasil ditambahkan");
	}
	
	public void printBook() {
		for(Book b:bookList) {
			System.out.println("Pembuat Buku: "+b.author);
			System.out.println("Judul Buku: "+b.title);
			System.out.println("Tahun Buku: "+b.yearPublish);
			System.out.println("-----------------");
		}
	}
	
	
}
