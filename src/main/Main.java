package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//instansiasi object dari kelas
		Book novel = new Book("Dikala kamu ada",50,"CoverA","Manda","novel");
		/*
		 * System.out.println("informasi buku -  tipe: "+novel.tipeBuku);
		 * System.out.println("Judul: "+novel.judul);
		 * System.out.println("Penulis: "+novel.author);
		 * System.out.println("Jumlah halaman: "+novel.jumHal); System.out.println();
		 */
		Book manga = new Book("Attack on titan",26,"Cover seri 1","Fujiko f fujio","manga");
		/*
		 * System.out.println("informasi buku -  tipe: "+manga.tipeBuku);
		 * System.out.println("Judul: "+manga.judul);
		 * System.out.println("Penulis: "+manga.author);
		 * System.out.println("Jumlah halaman: "+manga.jumHal);
		 */
		/*
		 * System.out.println("Berikan sinopsis untuk manga: ");
		 */		/*
		 * String sp = sc.nextLine(); manga.setSinopsis(sp);
		 */
		/*
		 * System.out.println("Sinopsis dari manga: "+manga.judul+" adalah: ");
		 * System.out.println(manga.sinopsis);
		 */
		//basic untuk si perpus
		Library lb = new Library("Perpus Binus");
		//tambahkan novel ke dalam perpus
		lb.addBuku(novel);
		lb.addBuku(manga);
		System.out.println("Jumlah buku di "+lb.namaPerpus+" adalah: "+lb.getJumBuku());
		lb.printAllBook();
	}
}
