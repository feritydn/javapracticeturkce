package javapracticeday06;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str1 = scan.nextLine();
		String kelime [] = str1.split(" ");
		
		for (int i= kelime.length-1; i>=0; i-- ) {
			System.out.print(kelime[i] + " ");
		}
		scan.close();
		
		

	}

}
