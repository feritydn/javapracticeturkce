package javapracticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayý tahmin oyunu" yazýnýz. 
		 * 
		 * 1. Adým : Java ile rastgele bir sayý üretelim 
		 *           (new Random() kullanabilrsiniz)
		 * 2. Adým : Kullanýcýdan tahminini alalým.
		 * 3. Adým : Kullanýcýnýn girdiði tahmini, bilgisayarýn ürettiði 
		 * 			 rastgele sayý ile karþýlaþtýralým.
		 * 4. Adým : Cevap doðru olana kadar 2. ve 3. adýmý tekrarlayalým, 
		 * 			 bunu da while döngüsü ile yapalým.
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Lutfen 0 ile 10 arasinda bir sayi giriniz");
		int num = scan.nextInt();
		int rastgele = random.nextInt(10);
		System.out.println(rastgele);
		
		while (num!=rastgele) {
			System.out.println("Yeni bir sayi giriniz");
			num = scan.nextInt();
		}
		if (num == rastgele) {
		System.out.println("Tebrikler");
		}else {
			System.out.println("Yanlis cevap! Tekrar deneyiniz");
		}
		scan.close();
		
	}

}
