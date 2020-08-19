package hastaneprojesi;

import java.util.Scanner;

public class HastaneRunner {

	private static Hastane hastane = new Hastane ();
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen rahatsizliginizi soyleyiniz");
		String hastaninDurumu =scan.next();
		String unvan = doctorUnvani(hastaninDurumu);
		System.out.println("Unvan :" + unvan);
		
		hastane.setDoktor(doktorBul(unvan));
		
		System.out.println("Doktor ismi:" + hastane.getDoktor().getIsim());
		System.out.println("Doktor soyisim:" + hastane.getDoktor().getSoyIsim());
		System.out.println("Doktor unvani:" + hastane.getDoktor().getUnvan());
		
	}

	public static String doctorUnvani(String aktuelDurum) {
		if (aktuelDurum.equals("Allerji")) {
			return hastane.unvanlar[0];
		}else if (aktuelDurum.equals("Bas agrisi")) {
			return hastane.unvanlar[1];
		}else if (aktuelDurum.equals("Diabet")) {
			return hastane.unvanlar[2];
		}else if (aktuelDurum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		}else if (aktuelDurum.equals("Migren")) {
			return hastane.unvanlar[4];
		}else if (aktuelDurum.equals("Kalp hastaliklari")) {
			return hastane.unvanlar[5];
		}else if (aktuelDurum.equals("Java Bilmiyor")) {
			return hastane.unvanlar[6];}
		return "Yanlis unvan";
	}
	
	public static Doktor doktorBul (String unvan) {
		
		Doktor doktor = new Doktor();
		
		for (int i=0; i<hastane.unvanlar.length; i++) {
			if (unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(hastane.unvanlar[i]);
			}
		}
		
		return doktor;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
