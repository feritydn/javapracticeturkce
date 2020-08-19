package arabaprojesiday6;

public class Toyota extends Car {

	protected String make = "Toyota";
	protected String model = "Corolla";
	protected int year = 2009;
	public static void main(String[] args) {
		/*
	    Bir class olusturunuz adi Toyota olsun
	    icerisinde 3 instance variable olsun 
	    protected String make = "Toyota";
	    protected String model = "Corolla";
	    protected int year = 2009;
	    Sonra 3 tane String return tipinden method olusturunuz
	    arabaMarkasi
	    arabaModeli
	    arabaYili
	    Son olarak bir oject olusturup method lari main method da print ediniz 
	    */
		Toyota toyota01 = new Toyota();
		System.out.println("Arabanin markasi: " + toyota01.make);
		System.out.println("Arabanin modeli:  " + toyota01.model);
		System.out.println("Arabanin yili :   " + toyota01.year);
		
		Toyota toyota02 = new Toyota("yaris", 2011);
		System.out.println("Arabanin markasi: " + toyota02.arabaMarkasi());
		System.out.println("Arabanin modeli:  " + toyota02.arabaModeli());
		System.out.println("Arabanin yili :   " + toyota02.arabaYili());
	}
	
	Toyota (){
		
	}
	
	Toyota (String model, int year){
		this.model = model;
		this.year = year;
		
	}
	
	public String arabaMarkasi () {
		return make;
	}
	
	public String arabaModeli() {
		return model;
	}
	
	public int arabaYili() {
		return year;
	}

}
