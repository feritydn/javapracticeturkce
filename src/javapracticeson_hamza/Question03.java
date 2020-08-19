package javapracticeson_hamza;
import java.util.Scanner;
public class Question03 {
	/* Kullanýcýnýn yazmýþ olduðu kelimenin içerisindeki harfleri, alfabeye göre bir sonraki
	 * harf ile deðiþtiriniz.
	 * 
	 * araba
	 * bsbcb
	 * 
	 * arabaz	
	 * bsbcba
	 * 
	 * 5 dk
	 * 9 geçe baþlayacaðýz.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kelimeyi yazýnýz :");
		String kelime = scan.next();
		String yeniKelime = getYeniKelime(kelime);
		System.out.println(yeniKelime);
		scan.close();
	}
	private static String getYeniKelime(String kelime) {
		String yeniKelime = "";
		for(int i = 0 ; i < kelime.length() ; i++) {
			char harf = kelime.charAt(i);   /// araba  charAt(0) > a     charAt(1) > b
			if(harf == 'z')
				harf = 'a';
			else if(harf == 'Z')
				harf = 'A';
			else
				harf += 1;
			yeniKelime += harf;
		}
		return yeniKelime;
	}
}
