package arabaprojesiday6;

public class Honda extends Car{

	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;

	public static void main(String[] args) {
		/*
		 * Bir class olusturunuz adi Honda olsun icerisinde 3 instance variable olsun
		 * protected String make = "Honda"; protected String model = "Accord"; protected
		 * int year = 2012; Sonra 3 tane String return tipinden method olusturunuz
		 * arabaMarkasi arabaModeli arabaYili Son olarak bir oject olusturup method lari
		 * main method da print ediniz
		 */
		Honda newHonda = new Honda();
		System.out.println("Arabanin markasi: " + newHonda.make);
		System.out.println("Arabanin modeli:  " + newHonda.model);
		System.out.println("Arabanin yili :   " + newHonda.year);
		
		Honda honda2 = new Honda ("Civic", 2014);
		System.out.println("Arabanin markasi: " + honda2.arabaMarkasi());
		System.out.println("Arabanin modeli:  " + honda2.arabaModeli());
		System.out.println("Arabanin yili :   " + honda2.arabaYili());
	}

	Honda() {

	}

	Honda(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public String arabaMarkasi() {
		return make;
	}

	public String arabaModeli() {
		return model;
	}

	public int arabaYili() {
		return year;
	}
}
