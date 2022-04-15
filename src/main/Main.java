package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		Book b = new Book("BukuPertama","125152192-125","Author",2016);
		Library lb = new Library("Perpus");
		lb.addBook(b);
		lb.printBook();
		
	}

}
