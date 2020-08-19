package javapract�ceday09_hamza;

public class OkulSistemiGiris {
	/*
	 * ��retmen, ��renci ve okul genel bilgilerinden olu�an JAVA program� yaz�n�z.
	 * 
	 * 1. Ad�m : Okulun sabit bilgilerini i�erisine ekleyece�imiz SabitBilgiler adl� bir class olu�tural�m
	 * 			 Buradaki verileri public static final olarak tutal�m.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Ad�m : Ogretmen adl� bir class olu�tural�m.
	 * 			 Bu classta ��retmenin ad�, bran�� ve telefon numaralar�n� tutal�m.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ��retmenlerin bilgilerini yazd�ral�m
	 * 
	 * 3. Ad�m : Ogrenci adl� bir class olu�tural�m.
	 * 			 Bu classta pgrencinin ad�, okulnumaras� bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ogrencilerin bilgilerini yazd�ral�m
	 * 
	 * 4. Ad�m : Ogretmenler adl� class olu�tural�m.
	 * 			 Bu classta t�m ��retmenleri tutual�m.
	 * 			 ��erisine List<Ogretmen> ogrentmenListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	 * 		     Bu class'�n i�ine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni ��retmen ekleyebilelim.
	 * 
	 * 5. Ad�m : Ogrenciler adl� class olu�tural�m.
	 * 			 Bu classta t�m ��renciler tutual�m.
	 * 			 ��erisine List<Ogrenci> ogrenciListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	 * 		     Bu class'�n i�ine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni ��renci ekleyebilelim.
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
