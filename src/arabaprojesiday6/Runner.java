package arabaprojesiday6;

public class Runner {

	public static void main(String[] args) {
		Car araba1 = new Honda();
		System.out.println("Arabanin markasi: " +  araba1.arabaMarkasi());
		System.out.println("Arabanin modeli: " +  araba1.arabaModeli());
		System.out.println("Arabanin yili: " +  araba1.arabaYili());
		
		
		System.out.println();
		
		Car araba2 = new Toyota();
		System.out.println("Arabanin markasi: " +  araba2.arabaMarkasi());
		System.out.println("Arabanin modeli: " +  araba2.arabaModeli());
		System.out.println("Arabanin yili: " +  araba2.arabaYili());
		
		System.out.println();
		Car araba3 = new Honda ("Jazz", 2020);
		System.out.println("Arabanin markasi: " +  araba3.arabaMarkasi());
		System.out.println("Arabanin modeli: " +  araba3.arabaModeli());
		System.out.println("Arabanin yili: " +  araba3.arabaYili());
	}

}
