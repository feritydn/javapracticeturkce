package javapracticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Whilde d�ng�s� kullanarak "say� tahmin oyunu" yaz�n�z. 
		 * 
		 * 1. Ad�m : Java ile rastgele bir say� �retelim 
		 *           (new Random() kullanabilrsiniz)
		 * 2. Ad�m : Kullan�c�dan tahminini alal�m.
		 * 3. Ad�m : Kullan�c�n�n girdi�i tahmini, bilgisayar�n �retti�i 
		 * 			 rastgele say� ile kar��la�t�ral�m.
		 * 4. Ad�m : Cevap do�ru olana kadar 2. ve 3. ad�m� tekrarlayal�m, 
		 * 			 bunu da while d�ng�s� ile yapal�m.
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
