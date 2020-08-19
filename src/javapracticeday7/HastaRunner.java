package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		
		Hasta hs1 =  new Hasta();
		
		Case case01 = new Case();
		
		case01.setActualCase("Headache");
		case01.setEmergency("Not Emergency");
		System.out.println("The current situation: " + case01.getActualCase());
		System.out.println("Emergency Situation  : " + case01.getEmergency());
		hs1.setIsim("Ali");
		hs1.setSoyIsim("Jhon");
		hs1.setActualCase(case01);;
		System.out.println("hasta 1 Isim: " + hs1.getIsim());
		System.out.println("hasta 1 Soyisim: " + hs1.getSoyIsim());
		System.out.println("hasta 1 durum: " + hs1.getActualCase().getActualCase());
		System.out.println("hastanin aciliyeti: " + hs1.getActualCase().getEmergency());
	}

}
