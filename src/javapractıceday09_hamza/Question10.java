package javapract�ceday09_hamza;

import java.util.Scanner;

public class Question10 {
	
	/*
	 * Soru: Klavyeden girilen herhangi bir say�n�n, okunu�unu ekrana yazd�r�n�z. 
	 * (max yaz�labilecek say� 999 olsun) - dokuzy�z doksan dokuz
	 * 
	 * 1. Ad�m : Kullan�c�dan say� alal�m.
	 * 2. Ad�m : Say�y� onlar, yuzler, binler basama��na b�lelim.
	 * 3. Ad�m : Switch case ile her say� i�in, o say�ya denk gelen okunu�u g�sterelim.
	 * 		�rnek : y�zler basama��ndaki 1 i�in, y�zler
	 * 		�rnek : onlar basama��ndaki 7 i�in yetmi� gibi. 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen sayinizi giriniz (max 999 - min 100)");
		int sayi = scan.nextInt();
		int birler = sayi%10;
		sayi = sayi/10;
		int onlar = sayi%10;
		sayi = sayi/10;
		int yuzler = sayi;
		sayisiOku(yuzler,onlar, birler);
		scan.close();
		
		/*
		String yaziHali = ""+sayi;
		String birlerBasamagi = yaziHali.substring(2,3);
		String onlarBasamagi = yaziHali.substring(1,2);
		String yuzlerBasamagi = yaziHali.substring(0,1);
		*/
	}
	
	private static void sayisiOku(int yuzler,int onlar,int birler) {
		switch (yuzler) {
		case 1: System.out.print("yuz ");break;
		case 2: System.out.print("ikiyuz ");break;
		case 3: System.out.print("ucyuz ");break;
		case 4: System.out.print("dortyuz ");break;
		case 5: System.out.print("besyuz ");break;
		case 6: System.out.print("altiyuz ");break;
		case 7: System.out.print("yediyuz ");break;
		case 8: System.out.print("sekizyuz ");break;
		case 9: System.out.print("dokuzyuz ");break;
		}
		switch (onlar) {
		case 1: System.out.print("on ");break;
		case 2: System.out.print("yirmi ");break;
		case 3: System.out.print("otuz ");break;
		case 4: System.out.print("kirk ");break;
		case 5: System.out.print("elli ");break;
		case 6: System.out.print("altmis ");break;
		case 7: System.out.print("yetmis ");break;
		case 8: System.out.print("seksen ");break;
		case 9: System.out.print("doksan ");break;
		}
		switch (birler) {
		case 1: System.out.print("bir ");break;
		case 2: System.out.print("iki ");break;
		case 3: System.out.print("uc ");break;
		case 4: System.out.print("dort ");break;
		case 5: System.out.print("bes ");break;
		case 6: System.out.print("alti ");break;
		case 7: System.out.print("yedi ");break;
		case 8: System.out.print("sekiz ");break;
		case 9: System.out.print("dokuz ");break;
		}
	}

}
