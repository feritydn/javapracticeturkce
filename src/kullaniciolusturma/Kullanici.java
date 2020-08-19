package kullaniciolusturma;

public class Kullanici {

	private String kullaniciAdi;
	private String parola;
	private String isim;
	private String soyisim;
	private String mail;
	
	
	public Kullanici(String kullaniciAdi, String parola, String isim, String soyisim, String mail) {
		
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.isim = isim;
		this.soyisim = soyisim;
		this.mail = mail;
	}


	public String getKullaniciAdi() {
		return kullaniciAdi;
	}


	public String getParola() {
		return parola;
	}


	public String getIsim() {
		return isim;
	}


	public String getSoyisim() {
		return soyisim;
	}


	public String getMail() {
		return mail;
	}


	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

	
	
	
}
