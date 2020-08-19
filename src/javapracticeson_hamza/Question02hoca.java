package javapracticeson_hamza;
import java.util.Arrays;
import java.util.Scanner;
public class Question02hoca {
	/* int ahmetinOkulNumarasi
	 * 
	 * örnek : merhaba java nasilsin
	 * çýktý : merhabaJavaNasilsin
	 * 
	 * 
	 * 5 dk verelim
	 * 30 geçe baþlayalým.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen method ismini giriniz : ");
		String isim = scan.nextLine(); // MERHABA java
		String methodIsmi = getFormataUygunIsim(isim);
		System.out.println("Normal Ýsim : " + methodIsmi);
		System.out.println("Gherkin Ýsim : " + getGherkinLanguageMethodIsmi(isim));
		scan.close();
	}
	private static String getFormataUygunIsim (String isim) {
		String yeniMethodIsmi = "";
		String[] kelimeler = isim.split(" ");  // [" MERHABA", " java"];
		System.out.println(Arrays.toString(kelimeler));
		for(int i = 0; i < kelimeler.length; i++) {
			String kelime = kelimeler[i].replace(" ", "");
			if(kelime.length() > 0) {
				if(i == 0) {
					yeniMethodIsmi += kelime.toLowerCase(); // "merhaba"
				}else {
					String ilkHarf = kelime.substring(0, 1).toUpperCase(); // j J
					String kalanHarfler = kelime.substring(1,kelime.length()).toLowerCase(); // ava   ava
					yeniMethodIsmi += ilkHarf;
					yeniMethodIsmi += kalanHarfler;				
				}
			}
		}
		return yeniMethodIsmi;
	}
	// Kullanýcý elma kelimesini arar -> kullanici_elma_kelimesini_arar
	private static String getGherkinLanguageMethodIsmi(String isim) {
		return isim.toLowerCase().replace(" ", "_");
	}
}