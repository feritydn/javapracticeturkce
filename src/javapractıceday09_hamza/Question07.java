package javapract�ceday09_hamza;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
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
		Scanner scan = new Scanner(System.in);
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		System.out.println("lutfen username giriniz");
		String username = scan.nextLine();
		
		username = username.replace(" ", "");
		int num= new Random().nextInt(10000);
		if (veritabanindakiKullaniciListesi.contains(username)) {
			System.out.println("Bu kullanici adi daha once kullanilmis");
			System.out.println("Bu kullanici adini kullanabilirsiniz: " + username + num  );
		}else {
			System.out.println("Dogru kullanici adiniz: " + username);
			veritabanindakiKullaniciListesi.add(username);
		}
		
		scan.close();
		
	}

}
