package javapracticeday7;

import java.util.Scanner;

public class StringManipulations02 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk
		// geri kalan harfleri kucuk yazdiriniz

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminiz ve soyisminizi giriniz");
		String name = scan.nextLine().toLowerCase();
		String str [] = name.split(" ");
		
		for (int i = 0; i<str.length; i++) {
			System.out.print(str[i].substring(0,1).toUpperCase() + str[i].substring(1)+ " ");
		}
		
		scan.close();
	}

}
