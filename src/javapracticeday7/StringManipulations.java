package javapracticeday7;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		// Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
		// geri kalan harfleri kucuk yazdiriniz
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen isminiz ve soyisminizi giriniz");
		String name = scan.nextLine().toLowerCase();
		int index = name.indexOf(" ");
		String lastName = name.substring(0,1).toUpperCase() + name.substring(1, index);
		System.out.println(lastName);
		String lastSurname = name.substring(index+1,index+2).toUpperCase() + name.substring(index+2);
		System.out.println(lastSurname);
		System.out.println(lastName + " " + lastSurname );
		scan.close();
	}

}
