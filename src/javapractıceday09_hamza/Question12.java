package javapract�ceday09_hamza;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c� taraf�ndan girilen yaz� ya da say�n�n polindrom olup 
		 * olmad���n� bulan bir program yaz�n�z.
		 * 
		 * 1. Ad�m : Kullan�c�dan veri alal�m.
		 * 2. Ad�m : For d�ng�s� kullanarak ald���m�z ifadenin tersini bulal�m.
		 * 3. Ad�m : Tersi ile normal ifadeyi kar��la�t�ral�m.
		 * 
		 *      12321 = 12321
		 *      
		 *      baab = baad
		 *      
		 *      ey edip adanada pide ye
		 * */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen herhangi bir deger giriniz");
		String str = scan.nextLine();
		String strReverse = "";
		for (int i=str.length()-1; i>=0; i--) {
			strReverse = str.charAt(i) + strReverse +"";
		}
		
		if (str.equals(strReverse)) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom degil");
		}
		scan.close();
	}

}
