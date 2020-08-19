package javapracticeday09_kisasorular_hamza;

import java.util.Scanner;

public class Question03 {
	
	/*
	 * Bir sayinin mukemmel olup olmadigini bulan method yaziniz.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		int sayi =scan.nextInt();
		System.out.println(getMukemmelMi(sayi));
		scan.close();
	}

	private static boolean getMukemmelMi(int sayi) {
		boolean mukemmel = false;
		int sum =0;
		for (int i = 1; i<=sayi/2; i++) {
			if (sayi%i==0) {
				sum +=i;
			}
			
			if(sum == sayi) {
				mukemmel = true;
			}
		}
		return mukemmel;
		
	}

}
