package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question07 {
	
	/* Girilen ifadenin, Array kullanarak tersini alal�m.
	 * 
	 * Deneme  -  emeneD
	 * 
	 * return yaps�n
	 * 
	 * getTersi(char[] array)
	 * 
	 * 27 ge�e ba�layal�m.
	 * 
	 * */
	
	
	// Girilen ifadeyi array kullanarak tersini alin.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ifade giriniz");
		String ifade = scan.nextLine();
		char arr [] = ifade.toCharArray();
		String ters = getTersi(arr);
		System.out.println("Tersi: "+ ters);
		scan.close();
	}

	private static String getTersi(char[] arr) {
		String ters = "";
			for (int i = arr.length-1; i>=0; i--) {
				ters += arr[i];
			}
		return ters;
	}

	
}
