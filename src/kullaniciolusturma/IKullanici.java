package kullaniciolusturma;

public interface IKullanici {
	
	void kullaniciKaydet(Kullanici kullanici);
	void kullaniciSil (int id);
	void kullaniciGuncelleme(int id, Kullanici kullanici);
	void kullaniciGoruntuleme();

}
