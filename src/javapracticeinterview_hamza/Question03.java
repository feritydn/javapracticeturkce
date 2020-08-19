package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question03 {
	
	

	public static void main(String[] args) {
		// rakamlarin toplamini return eden bir method yaziniz
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		int rakamlarToplami = getRakamlarinToplami( sayi);
		System.out.println(rakamlarToplami);
		scan.close();	
	}

	private static int getRakamlarinToplami(int sayi) {
		int toplam = 0;
		while (sayi > 0) {
			toplam = sayi%10 + toplam;
			sayi = sayi/10;
		
	}
		return toplam;

	}
	

}
