package javapract�ceday09_hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question09 {
	
	/*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
	 *  1. Ad�m : Kullan�c�dan ismini isteyelim
	 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
	 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
	 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
	 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
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
		System.out.println("L�tfen silmek istedi�iniz numaray� giriniz : ");
		long numara = scan.nextLong();
		if(rehber.get(numara) == null) {
			System.out.println("B�yle bir numara yok");
			if(rehber.size() > 0 )
				kisiCikar();
		} else {
			rehber.remove(numara);
			System.out.println("Kullan�c� ba�ar�yla silindi.");
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
