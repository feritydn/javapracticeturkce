package javapractýceday09_hamza;

public class OkulSistemiGiris {
	/*
	 * Öðretmen, öðrenci ve okul genel bilgilerinden oluþan JAVA programý yazýnýz.
	 * 
	 * 1. Adým : Okulun sabit bilgilerini içerisine ekleyeceðimiz SabitBilgiler adlý bir class oluþturalým
	 * 			 Buradaki verileri public static final olarak tutalým.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adým : Ogretmen adlý bir class oluþturalým.
	 * 			 Bu classta öðretmenin adý, branþý ve telefon numaralarýný tutalým.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman öðretmenlerin bilgilerini yazdýralým
	 * 
	 * 3. Adým : Ogrenci adlý bir class oluþturalým.
	 * 			 Bu classta pgrencinin adý, okulnumarasý bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman ogrencilerin bilgilerini yazdýralým
	 * 
	 * 4. Adým : Ogretmenler adlý class oluþturalým.
	 * 			 Bu classta tüm öðretmenleri tutualým.
	 * 			 Ýçerisine List<Ogretmen> ogrentmenListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	 * 		     Bu class'ýn içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öðretmen ekleyebilelim.
	 * 
	 * 5. Adým : Ogrenciler adlý class oluþturalým.
	 * 			 Bu classta tüm öðrenciler tutualým.
	 * 			 Ýçerisine List<Ogrenci> ogrenciListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	 * 		     Bu class'ýn içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öðrenci ekleyebilelim.
	 * 	 
	 * 
	 * */

	public static void main(String[] args) {
		
	System.out.println("******OKUL SISTEMINE HOSGELDINIZ******");
	System.out.println("Okul ismi:      " + SabitBilgiler.OKUL_ISMI);
	System.out.println("Mudur Bey:      " + SabitBilgiler.MUDUR);
	System.out.println("Adress:         " + SabitBilgiler.ADRES);
	System.out.println("Teknik Destek:  " + SabitBilgiler.TEKNIK_DESTEK);
	System.out.println("Telefon:        " + SabitBilgiler.TELEFON_NO);
	System.out.println("Web Adresi:     " + SabitBilgiler.WEB_ADRES);
	System.out.println();
	System.out.println("\n                 OGRETMEN OLUSTURMA");
	Ogretmen ogretmenSuleymanBey = new Ogretmen();
	ogretmenSuleymanBey.setIsim("Suleyman Alptekin");
	ogretmenSuleymanBey.setTelefon("05389745612");
	ogretmenSuleymanBey.setBrans("JAVA");
	System.out.println("\nOgretmen Suleyman: " + ogretmenSuleymanBey.toString());
	Ogretmen ogretmenHamzaBey = new Ogretmen();
	ogretmenHamzaBey.setIsim("Hamza Yilmaz");
	ogretmenHamzaBey.setBrans("Practice");
	ogretmenHamzaBey.setTelefon("0253348715");
	
	System.out.println("\nOgretmen Hamza: " + ogretmenHamzaBey.toString());
	// Cok onemli mutlaka tekrar et
	
	
	
	Ogretmen1 ogretmenAyseHanim = new Ogretmen1 ("Ayse Hanim", "Selenyum", "050000000");
	
	
	System.out.println("\nOgretmen Ayse: " + ogretmenAyseHanim.toString());
	
	System.out.println("\n            OGRENCI OLUSTURMA");
	
	Ogrenci ogrenci1 =  new Ogrenci();
	ogrenci1.setIsim("Adil Yesilmen");
	ogrenci1.setNo(123);
	
	System.out.println("\n" + ogrenci1.toString());
	
	Ogrenci ogrenci2 =  new Ogrenci();
	ogrenci2.setIsim("Ali Can");
	ogrenci2.setNo(124);
	System.out.println("\n" + ogrenci2.toString());
	
	Ogrenci ogrenci3 =  new Ogrenci();
	ogrenci3.setIsim("Ersin Kara");
	ogrenci3.setNo(125);
	System.out.println("\n" + ogrenci3.toString());
	
	System.out.println("\n     OGRETMENLER CLASS                \n");
	Ogretmenler ogretmenler = new Ogretmenler();
	ogretmenler.OgretmenEkle(ogretmenHamzaBey);
	ogretmenler.OgretmenEkle(ogretmenSuleymanBey);
	System.out.println("Ogretmen sayisi: " + ogretmenler.ogretmenSayisi());
	System.out.println(ogretmenler.toString());
	}

}
