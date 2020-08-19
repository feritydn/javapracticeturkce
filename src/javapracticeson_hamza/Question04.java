package javapracticeson_hamza;
import java.util.Arrays;
import java.util.Scanner;
public class Question04 {
	/* araba -> a 		(String)
	 * bebek -> b  e    (String)
	 * klavye -> 
	 * 
	 * 4 dk
	 * 
	 * 43 geçe baþlayalým.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kelimeyi yazýnýz :");
		String kelime = scan.next();
		String kopyaHarfler = getKopyaHarflerBirinciYol(kelime);
		System.out.println(kopyaHarfler);
		String kopyaHarfler2 = getKopyaHarflerIkinciYol(kelime);
		System.out.println(kopyaHarfler2);
		scan.close();
	}
	private static String getKopyaHarflerIkinciYol(String kelime) {
		String kopyaHarfler = "";
		char[] charArray = kelime.toCharArray();
		Arrays.sort(charArray);
		for(int i = 0 ; i < charArray.length - 1 ; i++) {   // aaabr
			if( charArray[i] == charArray[i+1] ) {
				if(!kopyaHarfler.contains(""+charArray[i]))
					kopyaHarfler += charArray[i];   // a
			}
		}
		return kopyaHarfler;
	}
	private static String getKopyaHarflerBirinciYol(String kelime) {
		// iki tane bos String olusturalim.
		String bosString = "";
		String kopyaHarfler = "";
		for(int i = 0 ; i < kelime.length() ; i++) {   // araba
			String harf = ""+kelime.charAt(i);
			if( !bosString.contains(harf) ) {  // false
				bosString+=harf;			  // arb
			}else {
				if(!kopyaHarfler.contains(harf)) {
					kopyaHarfler+=harf;
				}
			}
		}
		return kopyaHarfler;
	}
}