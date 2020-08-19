package javapractýceday09_hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question09 {
	
	/*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
	 *  1. Adým : Kullanýcýdan ismini isteyelim
	 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
	 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
	 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
	 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
	
	static Map<Long, String> rehber = new HashMap<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		boolean cikis = false;
		
		while(!cikis) {
			System.out.println("1. Kisi ekle, 2. kisi cikar, 3. rehberi goster, 4. cikis yap");
			System.out.println("lutfen secim yapiniz");
			int secim = scan.nextInt();
			
			switch(secim) {
			case 1:
				System.out.println("Kisi ekle secildi");
				kisiEkle();
				break;
			case 2:
				System.out.println("Kisi cikar secildi");
				kisiCikar();
				break;
			case 3:
				System.out.println("rehberi gor secildi");
				rehberiGor();
				break;
			case 4:
				System.out.println("cikis ekle secildi");
				cikis = true;
				break;	
			default:
				System.out.println("yanlis secim yaptiniz");
			}
		}
		System.out.println("Cikis yapildi");

	}

	private static void kisiCikar() {
		System.out.println("Lütfen silmek istediðiniz numarayý giriniz : ");
		long numara = scan.nextLong();
		if(rehber.get(numara) == null) {
			System.out.println("Böyle bir numara yok");
			if(rehber.size() > 0 )
				kisiCikar();
		} else {
			rehber.remove(numara);
			System.out.println("Kullanýcý baþarýyla silindi.");
		}
	}


	private static void kisiEkle() {
		System.out.println("Kisi ismi giriniz");
		String isim = scan.next();
		System.out.println("tel no giriniz");
		long num = scan.nextLong();
		rehber.put(num, isim);
		
	}

	private static void rehberiGor() {
		if (rehber.size()<1) {
			System.out.println("rehber bos");
			return;
		}
		
		for (Long numara : rehber.keySet()) {
			System.out.println(rehber.get(numara) + " :" + numara);
		}
		
	}
	
	

}
