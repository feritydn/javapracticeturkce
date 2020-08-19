package javapracticeinterview_hamza;

public class Question04 {

	/* Elimizdeki Array'in en b�y�k say�s�n� bulup, return yapan bir method yaz�n�z.
	 * 
	 * getEnBuyukSayi(int[] array)
	 * */
	public static void main(String[] args) {
		int[] array = {12,56,788,4,1,0,999,38884};
		int enBuyukSayi = getEnBuyukSayi(array);
		System.out.println("En buyuk Sayi: "+enBuyukSayi);
		
	}

	private static int getEnBuyukSayi(int[] array) {
		int max = 0;
		
		for(int i=0; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}

	
}
