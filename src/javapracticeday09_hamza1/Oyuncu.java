package javapracticeday09_hamza1;

public class Oyuncu {
	private int formaNumarasi; //0
	private float oyuncuYillikMaasi; //0.0
	private String oyuncuIsmi; // null
	private String oyuncuMevki; // null
	public Oyuncu(String isim, String mevki, int no, float maas) {
		this.formaNumarasi = no;
		this.oyuncuMevki = mevki;
		this.oyuncuIsmi = isim;
		this.oyuncuYillikMaasi = maas;
	}
	public int getFormaNumarasi() {
		return this.formaNumarasi;
	}
	public void setFormaNumarasi(int formaNumarasi) {
		this.formaNumarasi = formaNumarasi;
	}
	public float getOyuncuYillikMaasi() {
		return this.oyuncuYillikMaasi;
	}
	public void setOyuncuYillikMaasi(float oyuncuYillikMaasi) {
		this.oyuncuYillikMaasi = oyuncuYillikMaasi;
	}
	public String getOyuncuIsmi() {
		return this.oyuncuIsmi;
	}
	public void setOyuncuIsmi(String oyuncuIsmi) {
		this.oyuncuIsmi = oyuncuIsmi;
	}
	public String getOyuncuMevki() {
		return this.oyuncuMevki;
	}
	public void setOyuncuMevki(String oyuncuMevki) {
		this.oyuncuMevki = oyuncuMevki;
	}

}
