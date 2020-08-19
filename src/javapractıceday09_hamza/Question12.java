package javapractýceday09_hamza;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcý tarafýndan girilen yazý ya da sayýnýn polindrom olup 
		 * olmadýðýný bulan bir program yazýnýz.
		 * 
		 * 1. Adým : Kullanýcýdan veri alalým.
		 * 2. Adým : For döngüsü kullanarak aldýðýmýz ifadenin tersini bulalým.
		 * 3. Adým : Tersi ile normal ifadeyi karþýlaþtýralým.
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
