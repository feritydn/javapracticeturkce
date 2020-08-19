package javapracticeday8_hamza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Question05 {
	///			KEL�ME ANAL�Z�
		/*
		 * Girilen bir metinde kelimelerin ka� kere ge�ti�ini bulan program yaz�n�z.
		 * 
		 * 1. Ad�m : ( Kelime = Ka� Kere Ge�iyor ) �eklinde veri tutmak i�in HashMap 
		 * 				olu�turun.
		 * 2. Ad�m : Girilen metni split methodu ile par�alayal�m.	
		 * 			 ilk �nce "." ya g�re par�alay�p c�mleleri elde edelim
		 * 			 daha sonra " " bo�lu�a g�re par�alay�p kelimeleri elde edelim	
		 * 3. Ad�m : T�m kelimeleri kontrol etmek i�in for d�ng�s� kullanal�m ve 
		 * 				t�m kelimeleri olu�turdu�umuz hashMap'e aktaral�m.
		 * 			 E�er hashmap'te yoksa ekleyelim ve say�s�na 1 yazal�m.
		 * 		 	 E�er hashmap'te zaten varsa, say�s�n� bir art�ral�m.
		 * 3. Ad�m : T�m kelimeler kontrol edildikten ��kt� verelim. Ve t�m kelimeleri 
		 * 				tekrar say�s�yla birlikte g�sterelim.
		 * 
		 * �pucu : "." �zel karakter oldu�u i�in "\\." �eklinde split ediniz.
		 * */
		///// �rnek bir par�alama �iz
		//		c�mle bir. c�mle iki -- > split
		//		1. "c�mle bir" --- >> c�mle (1) , bir (1)
		//		2. "c�mle iki" --- >> c�mle (2) , iki (1)
	static Map<String,Integer> kelimeListesi = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�stedi�iniz metni giriniz : ");
		String metin = scan.nextLine();
		// c�mle bir. ahmet okula gitti
		String[] cumleler = metin.split("\\.");
		// c�mle bir
		// ahmet okula gitti
		for(int i = 0 ; i < cumleler.length ; i++) {
			String[] kelimeler = cumleler[i].trim().split(" ");
			// c�mle, bir
			for(int j = 0; j < kelimeler.length; j++) {
				if(kelimeListesi.get(kelimeler[j]) == null) { // null    
					kelimeListesi.put(kelimeler[j], 1);
				}else { // c�mle, 1
					int sayi = kelimeListesi.get(kelimeler[j]); // 1
					kelimeListesi.put(kelimeler[j], sayi+1);
				}
			}
		}
		for(String s : kelimeListesi.keySet()) {
			System.out.println(s + " = " + kelimeListesi.get(s));
		}
		scan.close();
	}
}