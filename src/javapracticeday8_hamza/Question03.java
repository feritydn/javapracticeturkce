package javapracticeday8_hamza;

public class Question03 {

	public static void main(String[] args) {
		/* �� i�e for d�ng�leri kullanarak �arp�m tablosunu ekrana yazd�r�n�z. 
		 * 1. Ad�m : 1'den 9'a kadar t�m say�lar� g�zden ge�irmek 
		 * 			 i�in for d�ng�s� olu�tur.
		 * 2. Ad�m : Her g�zden ge�irilen say� i�in 1'den 10'a kadar 
		 * 			 t�m say�larla �arp ve ekrana yazd�r.
		 * */
		
		for (int i =1; i<11; i++) {
			for (int j =1; j<11; j++) {
				System.out.println(i + "X " + j + "= " + (i*j));
			}
			System.out.println();
		}

	}

}
