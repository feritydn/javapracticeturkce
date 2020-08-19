package javapractýceday09_hamza;

import java.util.Scanner;

public class Question10 {
	
	/*
	 * Soru: Klavyeden girilen herhangi bir sayýnýn, okunuþunu ekrana yazdýrýnýz. 
	 * (max yazýlabilecek sayý 999 olsun) - dokuzyüz doksan dokuz
	 * 
	 * 1. Adým : Kullanýcýdan sayý alalým.
	 * 2. Adým : Sayýyý onlar, yuzler, binler basamaðýna bölelim.
	 * 3. Adým : Switch case ile her sayý için, o sayýya denk gelen okunuþu gösterelim.
	 * 		örnek : yüzler basamaðýndaki 1 için, yüzler
	 * 		örnek : onlar basamaðýndaki 7 için yetmiþ gibi. 
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
