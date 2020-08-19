package javapracticeday09_kisasorular_hamza;

import java.util.Scanner;

public class Question01 {
	
	// Kullanicinin girdigi sayinin asal sayi olup olmadigini bulunuz.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		int n = scan.nextInt();
		System.out.println(n + " sayisi asal mi?: " + getAsalmi(n));

		scan.close();
		
		}

	private static boolean getAsalmi(int n) {
        for (int i = 2; i < n/2; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;    
    }
}
