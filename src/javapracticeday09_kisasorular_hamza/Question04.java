package javapracticeday09_kisasorular_hamza;



public class Question04 {

	/* Array'in i�erisinde arad���m�z say�n�n ge�ip ge�medi�ini bulan bir method yaz�n�z.
	 *  getVarMi(int[] array)
	 *  	return true/false
	 *  
	 *  �rnek : 12, 56, 4, 8, 20, 876
	 *  
	 *  s�re 2dk
	 * 
	 * */
	public static void main(String[] args) {
		int[] sayilar = {12, 576, 4, 8, 20, 86}; // 7
		System.out.println(getVarMi(sayilar));
	}
	private static boolean getVarMi(int[] sayilar) {
		for(int i = 0 ; i < sayilar.length ; i++) {
			if(String.valueOf(sayilar[i]).contains("7"))
				return true;
		}
		return false;
	}
}
