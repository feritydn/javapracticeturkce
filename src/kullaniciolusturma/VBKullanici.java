package kullaniciolusturma;

import java.util.ArrayList;

public class VBKullanici implements IKullanici {

	ArrayList <Kullanici> kullanicilar = new ArrayList<Kullanici>();
	
	@Override
	public void kullaniciKaydet(Kullanici kullanici) {
		
		kullanicilar.add(kullanici);
		
	}

	@Override
	public void kullaniciSil(int id) {
		
		kullanicilar.remove(id);
		
	}

	@Override
	public void kullaniciGuncelleme(int id, Kullanici kullanici) {
		kullanicilar.set(id, kullanici);
		
	}

	@Override
	public void kullaniciGoruntuleme() {
		
		for (Kullanici kul : kullanicilar) {
			
			System.out.println("Kullanici adi: " + kul.getKullaniciAdi()+ "\nParala: " + kul.getParola() +
					"\nisim:" + kul.getIsim() + "nSoyisim: " + kul.getSoyisim() + "\nMail:" + kul.getMail());
			
		}
	}
	
	

}
