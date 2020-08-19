package javapracticeday09_kisasorular_hamza;

public class Question02 {
	
	/* Elimizdeki Array'in içerisindeki sayıların ortalamasını alan bir method yazınız.
	 * Array'imizin içerisindeki sayılar double.
	 * return double olarak bir return.
	 * 
	 * getOrtalama(double[] array)
	 *  return double
	 * 
	 * */

	public static void main(String[] args) {
		double sayilar [] = {10,20,30,40,50,60};
		
		System.out.println(getOrtalama(sayilar));

	}

	private static double getOrtalama(double [] sayilar) {
		double sum = 0.0;
		
		for(double i :sayilar) {
			sum +=i;
		}
		double ortalama =sum/sayilar.length; 
		
		return ortalama;
	}

}
