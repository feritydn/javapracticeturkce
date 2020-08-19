package javapracticeday09_hamza1;

import java.util.ArrayList;
import java.util.List;
public class Encapsolution01 {
	static TeknikDirektor direktor;
	static List<Oyuncu> oyuncular;
	static Takim takim;
	public static void main(String[] args) {
		oyunculariOlustur();
		teknikDirektorOlustur();
		takimOlustur();
		takim.takimiEkranaYazdir();
	}
	private static void takimOlustur() {
		// Farkl� methodlar methodlar i�erisinde olu�turdu�unuz variable'lara eri�mek i�in, 
		// o de�i�kenleri instance variable (yani methodun d���nda, class'�n i�inde) olarak olu�turman�z gerekiyor.
		takim = new Takim(direktor, oyuncular);
	}
	private static void teknikDirektorOlustur() {
		direktor = new TeknikDirektor("Fatih Terim", 50000f);
	}
	private static void oyunculariOlustur() {
		Oyuncu oyuncu1 = new Oyuncu("Muslera","Kaleci",1,10000f);
		Oyuncu oyuncu2 = new Oyuncu("Erg�n","Sol Bek",2,10000f);
		Oyuncu oyuncu3 = new Oyuncu("B�lent Korkmaz","Defans",3,45000f);
		Oyuncu oyuncu4 = new Oyuncu("Ahmet","Defans",4,4040f);
		Oyuncu oyuncu5 = new Oyuncu("Sabri Sar�o�lu","Sa� Bek",5,15000f);
		Oyuncu oyuncu6 = new Oyuncu("Emre","Defansif Orta Saha",6,60000f);
		Oyuncu oyuncu7 = new Oyuncu("Arif","Sol A��k",7,30000f);
		Oyuncu oyuncu8 = new Oyuncu("Hasan","Sa� A��k",8,76000f);
		Oyuncu oyuncu9 = new Oyuncu("Hakan ��k�r","Forvet",9,300000f);
		Oyuncu oyuncu10 = new Oyuncu("Hagi","Ofansif Orta Saha",10,90000f);
		Oyuncu oyuncu11 = new Oyuncu("Suat","Orta Saha",11,40000f);
		oyuncular = new ArrayList<>();
		oyuncular.add(oyuncu1);
		oyuncular.add(oyuncu2);
		oyuncular.add(oyuncu3);
		oyuncular.add(oyuncu4);
		oyuncular.add(oyuncu5);
		oyuncular.add(oyuncu6);
		oyuncular.add(oyuncu7);
		oyuncular.add(oyuncu8);
		oyuncular.add(oyuncu9);
		oyuncular.add(oyuncu10);
		oyuncular.add(oyuncu11);
	}

}
