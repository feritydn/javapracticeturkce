package javapracticeday06;

public class AileStaticVariable {
static int ailePizzasi =8;
	   int bireyselPizza = 8;
	public static void main(String[] args) {
		
		AileStaticVariable cocuk = new AileStaticVariable();
		ailePizzasi -=2;
		cocuk.bireyselPizza -=2;
		System.out.println("Cocuk yedikten sonra aile pizzasi: " + ailePizzasi);
		System.out.println("bireysel pizza: " + cocuk.bireyselPizza);
		
		AileStaticVariable anne = new AileStaticVariable();
		ailePizzasi -=2;
		anne.bireyselPizza -=2;
		System.out.println("Anne yedikten sonra  aile pizzasi: " + ailePizzasi);
		System.out.println("bireysel pizza: " + anne.bireyselPizza);
		
		AileStaticVariable baba = new AileStaticVariable();
		ailePizzasi -=2;
		baba.bireyselPizza -=2;
		
		System.out.println("Baba yedikten sonra  aile pizzasi: " + ailePizzasi);
		System.out.println("bireysel pizza: " + baba.bireyselPizza);
		
	}

}
