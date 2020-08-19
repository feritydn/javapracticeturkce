package javapract�ceday09_hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question13 {
	/*
	 * ATM uygulamas� yap�n�z.
	 * 
	 * 1. Ad�m : Bankam�zdaki m��terilerin musteriNumarasi ve 4 haneli �ifresini tutan bir HashMap olu�tural�m.
	 * 		     Ve �u m��terileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			M��teri No  -- �ifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Ad�m : Bankam�zdaki m��terilerin hesaplar�ndaki para miktarini tutan bir tane HashMap olu�tural�m.
	 * 		     Ve �u miktarlar� m��teri numaras�yla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			M��teri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Ad�m : Giri� ekran� olu�tural�m. M��teri buradan giri� yaps�n.
	 * 			 Kullan�c� ad� ve �ifre isteyelim, do�ru ise giri� yaps�n.
	 * 
	 * 4. Ad�m : Do�ru m��teri numaras� ve �ifre kontrol eden methodlar yazal�m.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, do�ru m��teri numaras�d�r.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki �ifre ile uyu�uyorsa do�ru �ifredir.
	 * 
	 * 5. Ad�m : Gir� yapt�ktan sonra kar��s�na 3 tane se�enek ��ks�n : 
	 * 			 Bunlar� da menuGoster() methodu ile yapal�m.
	 * 			 1- Para �ek
	 * 			 2- Para Y�kle
	 * 			 3- Toplam Param� G�r	
	 * 			 3- ��k�� Yap	
	 * 
	 * 6. Ad�m : ��k�� methodu olu�tural�m.
	 * 			 Giri� yapan m��teri ��k�� yapmak isterse, toplamPara ve girisYapanMusteriNo'yu s�f�rlayal�m.
	 * 			 Tekrar giri� ekran�na y�ndendirelim.	
	 * 
	 * 6. Ad�m : Toplam parami gor methodu olu�tural�m. toplamParamiGor()
	 * 			
	 * 7. Ad�m : 1- Para �ekme Methodu Olu�tural�m
	 * 			 Hesaba giri� yapan m��teriye hesab�ndaki toplam paray� g�sterelim.
	 * 			 Kullan�c�dan �ekmek istedi�i tutar� ��renelim.	
	 * 			 Hesab�nda yeterli para varsa, para �eksin yoksa uyar� verelim.
	 * 			 �ekti�i tutar�, toplam paras�ndan d��elim ve kaydedelim.		
	 *			 Ba�ka i�lem yapmak isteyip istemedi�ini soral�m, isterse yapt�ral�m, yoksa ��k�� i�lemi ger�ekle�tirelim.
	 * 		  
	 * 8. Ad�m : 1- Para Y�kleme Methodu Olu�tural�m
	 * 			 Hesaba giri� yapan m��teriye hesab�ndaki toplam paray� g�sterelim.
	 * 			 Kullan�c�dan y�klemek istedi�i tutar� ��renelim.	
	 * 			 Y�kledi�i tutar�, toplam paras�na ekleyelim ve g�sterelim.
	 * 			 Ba�ka i�lem yapmak isteyip istemedi�ini soral�m, isterse yapt�ral�m, yoksa ��k�� i�lemi ger�ekle�tirelim.
	 * 
	 * */	
	
	static Map <Integer,Integer> musteriBilgileri = new HashMap<>();
	
	static Map <Integer, Float>  toplamParaMiktarlari = new HashMap<>();
	
	static Scanner scan = new Scanner(System.in);
	
	static int girisYapanKullancininMusteriNumarasi =0;
	
	static float girisYapanKullancininHesabindakipara =0; 

	public static void main(String[] args) {
		
		musteriBilgileri.put(12345678, 1876);
		musteriBilgileri.put(22222222, 1234);
		musteriBilgileri.put(98765432, 1453);
		musteriBilgileri.put(55554444, 2020);
		
		toplamParaMiktarlari.put(12345678, 120.0f);
		toplamParaMiktarlari.put(22222222, 1000.0f);
		toplamParaMiktarlari.put(98765432, 5.0f);
		toplamParaMiktarlari.put(55554444, 255.0f);
		
		
		girisEkrani();
		

	}

	private static void girisEkrani() {
		
		System.out.println("Musteri numaranizi giriniz");
		int musteriNo = scan.nextInt();
		if(musteriBilgileri.get(musteriNo) == null) {
			System.out.println("Boyle bir musteri yok");
			girisEkrani();
			return;
		}else {
			System.out.println(musteriNo);
		}
		System.out.println("Sifrenizi giriniz");
		int sifre = scan.nextInt();
		
		if (musteriBilgileri.get(musteriNo) == sifre) {
			System.out.println("Hos Geldiniz");
			girisYapanKullancininMusteriNumarasi = musteriNo;
			girisYapanKullancininHesabindakipara = toplamParaMiktarlari.get(musteriNo);
			menuGoster();
			
		}else {
			System.out.println("Yanlis sifre girdiniz");
			girisEkrani();
			return;
		}
			
		
		
		
		
	}

	private static void menuGoster() {
		System.out.println("SECIM YAPINIZ \n 1 PARA YUKLE \n 2- PARA CEK \n 3 TOPLAM PARAMI GOR \n 4 CIKIS");
		int secim = scan.nextInt();
		
		switch (secim) {
			case 1:
				System.out.println("Ne kadar para yuklemek istersiniz");
				float miktar = scan.nextFloat();
				girisYapanKullancininHesabindakipara =miktar + girisYapanKullancininHesabindakipara;
				System.out.println("para hesaba yatirildi");
				System.out.println("Toplam paraniz: " + girisYapanKullancininHesabindakipara);
				menuGoster();
				break;
			case 2:
				System.out.println("Cekmek istediginiz para miktarini giriniz");
				paraCek();
				
				break;
			case 3:
				System.out.println("Hesabinizdaki Toplam para:" + girisYapanKullancininHesabindakipara );
				menuGoster();
				break;
			case 4:
				System.out.println("Cikis yapildi");
				girisEkrani();
				break;
			default:
				System.out.println("YANLIS SECIM");
				menuGoster();
				break;
		}
	}

	private static void paraCek() {
		float miktar = scan.nextFloat();
		if (girisYapanKullancininHesabindakipara < miktar) {
			System.out.println("hesabinizda sadece " + girisYapanKullancininHesabindakipara + " var." );
			paraCek();
		}else {
			girisYapanKullancininHesabindakipara = girisYapanKullancininHesabindakipara - miktar;
			System.out.println("Kalan Bakiye: " + girisYapanKullancininHesabindakipara);
			menuGoster();
		}
		
	}

}
