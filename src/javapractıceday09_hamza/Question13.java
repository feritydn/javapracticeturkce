package javapractýceday09_hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question13 {
	/*
	 * ATM uygulamasý yapýnýz.
	 * 
	 * 1. Adým : Bankamýzdaki müþterilerin musteriNumarasi ve 4 haneli þifresini tutan bir HashMap oluþturalým.
	 * 		     Ve þu müþterileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			Müþteri No  -- Þifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Adým : Bankamýzdaki müþterilerin hesaplarýndaki para miktarini tutan bir tane HashMap oluþturalým.
	 * 		     Ve þu miktarlarý müþteri numarasýyla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			Müþteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Adým : Giriþ ekraný oluþturalým. Müþteri buradan giriþ yapsýn.
	 * 			 Kullanýcý adý ve þifre isteyelim, doðru ise giriþ yapsýn.
	 * 
	 * 4. Adým : Doðru müþteri numarasý ve þifre kontrol eden methodlar yazalým.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, doðru müþteri numarasýdýr.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki þifre ile uyuþuyorsa doðru þifredir.
	 * 
	 * 5. Adým : Girþ yaptýktan sonra karþýsýna 3 tane seçenek çýksýn : 
	 * 			 Bunlarý da menuGoster() methodu ile yapalým.
	 * 			 1- Para Çek
	 * 			 2- Para Yükle
	 * 			 3- Toplam Paramý Gör	
	 * 			 3- Çýkýþ Yap	
	 * 
	 * 6. Adým : Çýkýþ methodu oluþturalým.
	 * 			 Giriþ yapan müþteri çýkýþ yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sýfýrlayalým.
	 * 			 Tekrar giriþ ekranýna yöndendirelim.	
	 * 
	 * 6. Adým : Toplam parami gor methodu oluþturalým. toplamParamiGor()
	 * 			
	 * 7. Adým : 1- Para Çekme Methodu Oluþturalým
	 * 			 Hesaba giriþ yapan müþteriye hesabýndaki toplam parayý gösterelim.
	 * 			 Kullanýcýdan çekmek istediði tutarý öðrenelim.	
	 * 			 Hesabýnda yeterli para varsa, para çeksin yoksa uyarý verelim.
	 * 			 Çektiði tutarý, toplam parasýndan düþelim ve kaydedelim.		
	 *			 Baþka iþlem yapmak isteyip istemediðini soralým, isterse yaptýralým, yoksa çýkýþ iþlemi gerçekleþtirelim.
	 * 		  
	 * 8. Adým : 1- Para Yükleme Methodu Oluþturalým
	 * 			 Hesaba giriþ yapan müþteriye hesabýndaki toplam parayý gösterelim.
	 * 			 Kullanýcýdan yüklemek istediði tutarý öðrenelim.	
	 * 			 Yüklediði tutarý, toplam parasýna ekleyelim ve gösterelim.
	 * 			 Baþka iþlem yapmak isteyip istemediðini soralým, isterse yaptýralým, yoksa çýkýþ iþlemi gerçekleþtirelim.
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
