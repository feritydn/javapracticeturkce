package javapracticeson_hamza;

import java.util.Scanner;

public class Question02 {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("method ismi giriniz");
		String str = scan.nextLine().toLowerCase();
		String arr[] = str.split(" ");
		String method = methodIsmi(arr);
		System.out.println(method);
		scan.close();

	}

	private static String methodIsmi(String[] arr) {
		String yeniMethodIsmi = "";
	for (int i = 0; i<arr.length; i++) {
		yeniMethodIsmi = yeniMethodIsmi +  arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
	}
	
	yeniMethodIsmi = yeniMethodIsmi.substring(0,1).toLowerCase() + yeniMethodIsmi.substring(1);
		return yeniMethodIsmi;
	}

}
