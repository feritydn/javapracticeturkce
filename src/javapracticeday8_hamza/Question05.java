package javapracticeday8_hamza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Question05 {
	///			KELÝME ANALÝZÝ
		/*
		 * Girilen bir metinde kelimelerin kaç kere geçtiðini bulan program yazýnýz.
		 * 
		 * 1. Adým : ( Kelime = Kaç Kere Geçiyor ) Þeklinde veri tutmak için HashMap 
		 * 				oluþturun.
		 * 2. Adým : Girilen metni split methodu ile parçalayalým.	
		 * 			 ilk önce "." ya göre parçalayýp cümleleri elde edelim
		 * 			 daha sonra " " boþluða göre parçalayýp kelimeleri elde edelim	
		 * 3. Adým : Tüm kelimeleri kontrol etmek için for döngüsü kullanalým ve 
		 * 				tüm kelimeleri oluþturduðumuz hashMap'e aktaralým.
		 * 			 Eðer hashmap'te yoksa ekleyelim ve sayýsýna 1 yazalým.
		 * 		 	 Eðer hashmap'te zaten varsa, sayýsýný bir artýralým.
		 * 3. Adým : Tüm kelimeler kontrol edildikten çýktý verelim. Ve tüm kelimeleri 
		 * 				tekrar sayýsýyla birlikte gösterelim.
		 * 
		 * Ýpucu : "." özel karakter olduðu için "\\." þeklinde split ediniz.
		 * */
		///// örnek bir parçalama çiz
		//		cümle bir. cümle iki -- > split
		//		1. "cümle bir" --- >> cümle (1) , bir (1)
		//		2. "cümle iki" --- >> cümle (2) , iki (1)
	static Map<String,Integer> kelimeListesi = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýstediðiniz metni giriniz : ");
		String metin = scan.nextLine();
		// cümle bir. ahmet okula gitti
		String[] cumleler = metin.split("\\.");
		// cümle bir
		// ahmet okula gitti
		for(int i = 0 ; i < cumleler.length ; i++) {
			String[] kelimeler = cumleler[i].trim().split(" ");
			// cümle, bir
			for(int j = 0; j < kelimeler.length; j++) {
				if(kelimeListesi.get(kelimeler[j]) == null) { // null    
					kelimeListesi.put(kelimeler[j], 1);
				}else { // cümle, 1
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