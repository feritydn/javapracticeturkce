package javapracticeson_hamza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question05 {
	/* "ab" -> "aba" -> "kaba" -> "kabak" ->
	 * 
	 * 5 dk
	 * 
	 * */
	public static void main(String[] args) {
		List<String> kelimeler = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean devamMi = true;
		int siraKimde = 0;
		int oyunSayisi = 0;
		while(devamMi) {
			siraKimde = oyunSayisi % 2 + 1;  // 1.kullan�c�
			System.out.println(siraKimde +" Kullan�c� kelime yaz�n�z : ");
			String kelime = scan.next();
			kelimeler.add(kelime);
			devamMi = getDevamMi(kelimeler); // true
			oyunSayisi++;
		}
		int siraBelirle = siraKimde == 1 ? 2 : 1;
		
		System.out.println(siraBelirle + ". kullan�c� kazand�.");
		System.out.println(kelimeler);
		scan.close();
	}
	private static boolean getDevamMi(List<String> kelimeler) {
		// yaz�lan kelime, bir �nceki yaz�lan kelimeyi kaps�yor mu (kaba - kabak)
		// yaz�lan kelimenin uzunlu�u ile bir �nceki kelimenin uzunlu�u fark� 1 mi
		if(kelimeler.size() < 2)
			return true;
		String sonKelime = kelimeler.get(kelimeler.size() - 1);
		String birOncekiKelime = kelimeler.get(kelimeler.size() - 2);
		if(sonKelime.length() - birOncekiKelime.length() != 1)
			return false;
		if(!sonKelime.contains(birOncekiKelime))
			return false;
		return true;
	}
}