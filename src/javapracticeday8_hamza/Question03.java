package javapracticeday8_hamza;

public class Question03 {

	public static void main(String[] args) {
		/* Ýç içe for döngüleri kullanarak çarpým tablosunu ekrana yazdýrýnýz. 
		 * 1. Adým : 1'den 9'a kadar tüm sayýlarý gözden geçirmek 
		 * 			 için for döngüsü oluþtur.
		 * 2. Adým : Her gözden geçirilen sayý için 1'den 10'a kadar 
		 * 			 tüm sayýlarla çarp ve ekrana yazdýr.
		 * */
		
		for (int i =1; i<11; i++) {
			for (int j =1; j<11; j++) {
				System.out.println(i + "X " + j + "= " + (i*j));
			}
			System.out.println();
		}

	}

}
