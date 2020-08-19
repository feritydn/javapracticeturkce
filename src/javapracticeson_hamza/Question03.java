package javapracticeson_hamza;
import java.util.Scanner;
public class Question03 {
	/* Kullan�c�n�n yazm�� oldu�u kelimenin i�erisindeki harfleri, alfabeye g�re bir sonraki
	 * harf ile de�i�tiriniz.
	 * 
	 * araba
	 * bsbcb
	 * 
	 * arabaz	
	 * bsbcba
	 * 
	 * 5 dk
	 * 9 ge�e ba�layaca��z.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen kelimeyi yaz�n�z :");
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
