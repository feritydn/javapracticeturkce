package javapracticeinterview_hamza;
import java.util.Scanner;
public class Question08 {
	/* Girilen e-mailin doðru olup olmadýðýný anlayan bir method yazýnýz.
	 * Method boolean veri tipinde deðer döndersin.
	 * 
	 * hamzayilmaz   // @   .   " "    2
	 * 
	 * getEmailDogruMu(String mail)
	 * 
	 * 40 geçe baþlayalým
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir e-mail yazýnýz : ");
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