package javapracticeinterview_hamza;
import java.util.Scanner;
public class Question08 {
	/* Girilen e-mailin do�ru olup olmad���n� anlayan bir method yaz�n�z.
	 * Method boolean veri tipinde de�er d�ndersin.
	 * 
	 * hamzayilmaz   // @   .   " "    2
	 * 
	 * getEmailDogruMu(String mail)
	 * 
	 * 40 ge�e ba�layal�m
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir e-mail yaz�n�z : ");
		String email = scan.next();
		boolean dogruMu = getEmailDogruMu(email);
		System.out.println("Email : " +dogruMu);
		scan.close();
	}
	private static boolean getEmailDogruMu(String email) {
		if(!email.contains("@"))
			return false;
		if(!email.contains("."))
			return false;
		if(email.length()<=4)
			return false;
		String[] array = email.split("@");
		if(array[0].length()<1)
			return false;
		if(array[1].length()<3)
			return false;
		if(array.length > 2)
			return false;
		return true;
	}
}