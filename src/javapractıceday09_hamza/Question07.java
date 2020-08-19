package javapractýceday09_hamza;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
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
		Scanner scan = new Scanner(System.in);
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
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
