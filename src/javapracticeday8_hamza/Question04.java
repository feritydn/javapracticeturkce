package javapracticeday8_hamza;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/* 1. Kullanýcýnýn girdiði sayýnýn, for döngüsü kullanarak rakamlarý toplamýný bulan method yazýnýz.
		 * 
		 * 1. Adým : Kullanýcýdan sayý al.
		 * 2. Adým : Sayýyý String'e çevirin.
		 * 3. Adým : String'in her elemanýný sayýya çevir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapalým methodumuz toplamý return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		
		/* 2. Kullanýcýnýn girdiði sayýnýn, while döngüsü kullanarak 
		 * 			 rakamlarý toplamýný bulan method yazýnýz.
		 * 
		 * 1. Adým : Kullanýcýdan sayý al.
		 * 2. Adým : Sayýnýn %10'unu alarak son hanesini al ve toplama ekle.
		 * 3. Adým : Daha sonra sayýyý son haneden kurtarmak için 10'a böl.
		 * 4. Adým : Sayý 0 olarak kadar bu iþlemi while döngüsü ile tekrarla.
		 * 
		 * Bunu da method kullanarak yapalým, toplamý return etsin.
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


