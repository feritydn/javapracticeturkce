package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question06 {
	
	/*	Girilen say� ya metnin polindrom olup olmad���n� kontrol eden bir method yaz�n�z.
	 *  method boolean olarak bir de�er return etsin.
	 *  
	 *  getPolindrom(String metin)
	 * 
	 * */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir ifade griniz");
		String ifade = scan.nextLine();
		if(getPolindrom(ifade.toLowerCase())) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom degil");
		}
		scan.close();
	}

	private static boolean getPolindrom(String ifade) {

		int i = 0;
		int j = ifade.length()-1;
		
		while (i < j) {
			if(ifade.charAt(i) !=ifade.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
