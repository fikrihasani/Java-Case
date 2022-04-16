package main;

public class Book {
	//sifat atau data yang dimilki oleh si buku
	public String judul;
	public int jumHal;
	public String cover;
	public String author;
	public String sinopsis;
	public String tipeBuku;
	
	//constructor = merpakan sebuah fungsi juga
	public Book(String judul,int jumHal, String cover, String author, String tipeBuku) {
		this.judul = judul;
		this.jumHal = jumHal;
		this.cover = cover;
		this.author = author;
		this.tipeBuku = tipeBuku;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
}
