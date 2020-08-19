package javapracticevarmisinyokmusun_hamza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilgiler {

	
	static List<String> isimler = new ArrayList<>();


	public Bilgiler() {
		
	}

	public static void main(String[] args) {
		isimler.add("Ramazan");
		isimler.add("Ýbrahim");
		isimler.add("Ýskender");
		isimler.add("Ali");
		System.out.println(isimler.toString());
		
		// ArayList"in icindeki vrileri rastgele siralar.
		Collections.shuffle(isimler);
		System.out.println(isimler.toString());
		
		//ArrayListin icinde direkt object tutuma
		
		List <Kutu>kutular = new ArrayList<>();
		Kutu kutu = new Kutu();
		kutular.add(kutu);
		
		Child childNesnesi = new Child();
		System.out.println(childNesnesi.toString());
		childNesnesi.ParentIsimYazdir();
	}

}
