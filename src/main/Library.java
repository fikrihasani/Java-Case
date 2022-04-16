package main;

import java.util.ArrayList;

public class Library {
	public String namaPerpus;
	public ArrayList<Book> b;
	private int jumlahBuku;
	
	public Library(String namaPerpus) {
		this.namaPerpus = namaPerpus;
		//inisiasi kumpulan buku kosong
		this.b = new ArrayList<Book>();
		this.jumlahBuku = 0;
	}
	
	public void addBuku(Book buku) {
		//menambahkan buku ke koleksi buku
		this.b.add(buku);
		this.jumlahBuku  = this.jumlahBuku + 1;
	}
	
	//getter
	public int getJumBuku() {
		return this.jumlahBuku;
	}
	
	public void printAllBook() {
		System.out.println("Buku yang ada di: "+this.namaPerpus);
		for(Book b:this.b) {
			System.out.println("informasi buku -  tipe: "+b.tipeBuku);
			System.out.println("Judul: "+b.judul);
			System.out.println("Penulis: "+b.author);
			System.out.println("Jumlah halaman: "+b.jumHal);
			System.out.println("----------------------");
		}
	}
}
