package javapracticeday09_hamza1;

import java.util.ArrayList;
import java.util.List;
public class Takim {
	private TeknikDirektor teknikDirektor;
	private List<Oyuncu> oyuncular = new ArrayList<>();
	public Takim(TeknikDirektor teknikDirektor, List<Oyuncu> oyuncular) {
		this.teknikDirektor = teknikDirektor;
		this.oyuncular = oyuncular;
	}
	public void takimiEkranaYazdir() {
		System.out.println("Teknik Direktör Ýsim : " + teknikDirektor.getIsim());
		System.out.println("Teknik Direktör Maaþ : " + teknikDirektor.getMaas());
		for(int i = 0; i < oyuncular.size() ; i++) {
			System.out.println( oyuncular.get(i).getFormaNumarasi() + 
					" - " + oyuncular.get(i).getOyuncuIsmi() + 
					" - " + oyuncular.get(i).getOyuncuMevki() + 
					" - "+  oyuncular.get(i).getOyuncuYillikMaasi() );
		}
	}
}
