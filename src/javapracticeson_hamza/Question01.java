package javapracticeson_hamza;
import java.util.Arrays;
public class Question01 {
	/* �ki farkl� Array'i birle�tiren ve olu�turdu�u yeni Array'i return eden
	 * bir method yaz�n�z.
	 * 
	 * getBirlestirilmisArray(int[] array1, int[] array2)
	 * 	return yeniArray;
	 * 
	 * [1,2,3] ve [5,6,7]
	 * 
	 * [1,2,3,5,6,7]
	 * 
	 * 3 dk s�re verelim.
	 * 
	 * */
	public static void main(String[] args) {
		int[] array1 = {1,2,3};
		int[] array2 = {5,6,7};
		int[] yeniArray = getBirlestirilmisArray(array1,array2);
		System.out.println(Arrays.toString(yeniArray));
	}
	private static int[] getBirlestirilmisArray(int[] array1, int[] array2) {
		int uzunluk = array1.length + array2.length;
		int[] yeniArray = Arrays.copyOf(array1, uzunluk); 
		for(int i = 0; i < array2.length ; i++) { 
			yeniArray[array1.length+i] = array2[i];
		}
		return yeniArray;
	}
}