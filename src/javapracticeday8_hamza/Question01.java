package javapracticeday8_hamza;
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		
		/* Santimetreyi, metreye ve kilometreye �eviren bir program yaz�n�z.
		 * ��kt� : 		 L�tfen santimetre de�erini giriniz:		 	
		 * 212		 212 santimetre 2.12 metre ve 0.00212 kilometreye e�ittir.		 		
		 * �pucu : 100 cm = 1 mt = 0.001 kilometre				
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen santimetre degerini giriniz");
		int santimetre = scan.nextInt();
		float metre = santimetre/100f;
		float kilometre = santimetre / 100000f;
		System.out.println("\ngetMetre: " + getMetre(santimetre));
		System.out.println("getMetre: " + getkilometre(santimetre));
				
		System.out.println("metre: " + metre);
		System.out.println("Kilometre: " + kilometre);
		scan.close();
	}
	private static float getMetre (int santimetre) {
		return santimetre/100f;
	}
	
	private static float getkilometre (int santimetre) {
		return santimetre/100000f;
	}
}
