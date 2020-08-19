package kullaniciolusturma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VBKullanici vbKullanici = new VBKullanici();
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("1-) Kullanici ekle \n2) Kullanici sil \n3) Kullaninici Guncelle \n4) Tum kullanicilar \n5 Cikis");
			int islem = input.nextInt();
			if(islem == 1) {
				System.out.println("Kullanici adi giriniz");
				String kullaniciAdi = input.next();
				System.out.println("Parola giriniz");
				String parola = input.next();
			}
		}

	}

}
