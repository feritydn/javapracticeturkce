package javapracticeday8_hamza;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/* 1. Kullan�c�n�n girdi�i say�n�n, for d�ng�s� kullanarak rakamlar� toplam�n� bulan method yaz�n�z.
		 * 
		 * 1. Ad�m : Kullan�c�dan say� al.
		 * 2. Ad�m : Say�y� String'e �evirin.
		 * 3. Ad�m : String'in her eleman�n� say�ya �evir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapal�m methodumuz toplam� return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		
		/* 2. Kullan�c�n�n girdi�i say�n�n, while d�ng�s� kullanarak 
		 * 			 rakamlar� toplam�n� bulan method yaz�n�z.
		 * 
		 * 1. Ad�m : Kullan�c�dan say� al.
		 * 2. Ad�m : Say�n�n %10'unu alarak son hanesini al ve toplama ekle.
		 * 3. Ad�m : Daha sonra say�y� son haneden kurtarmak i�in 10'a b�l.
		 * 4. Ad�m : Say� 0 olarak kadar bu i�lemi while d�ng�s� ile tekrarla.
		 * 
		 * Bunu da method kullanarak yapal�m, toplam� return etsin.
		 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num = scan.nextInt();
		System.out.println("for ile: "+getRakamlarToplami(num));
		System.out.println("While ile: "+getRakamlarToplamiWhileDongusu(num));
		scan.close();
	}
	
	public static int getRakamlarToplami(int sayi) {
		String sayininStringi = String.valueOf(sayi);
		int toplam = 0;
		for (int i = 0; i<sayininStringi.length(); i++) {
		int sayiyaCevir = Integer.parseInt(sayininStringi.substring(i, i+1));
		toplam += sayiyaCevir;
		}
		
		return toplam;
	}
	
	public static int getRakamlarToplamiWhileDongusu(int sayi) {
		
		int sum =0;
		while (sayi !=0) {
			sum = sum + sayi%10;
			sayi = sayi/10;
		}
		return sum;

	}
}


