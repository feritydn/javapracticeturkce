package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question01 {

	/* Kullan�c�dan say� al�n ve o say� kadar ard arda gelen fibonacci say� 
	 * dizisini ekrana yazd�r�n
	 * �rnek : Kullan�c� 10 say�s�n� girdi, 10 tane say�y� ekrana yazd�raca��z.
	 * 		   0 1 1 2 3 5 8 13 21 34	
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		int sayi1 = 0;
		int sayi2 = 1;
		int ilkikisayinintoplami = sayi1 + sayi2;
		System.out.print(sayi1 + " " + sayi2);
		
		for (int i=2; i<sayi; i++) {
			ilkikisayinintoplami = sayi1 + sayi2;
			sayi1 = sayi2;
			sayi2 = ilkikisayinintoplami;
			System.out.print(" " + ilkikisayinintoplami);
		}
		
scan.close();
	}

}
