package javapracticeday06;

public class StaticVariable {
static int num1 = 15;
	   int num2 = 15;
	public static void main(String[] args) {
		/*
		Iki tane instance int variable olusturunuz ve biri
		 static digeri non-static olsun
		sonra bu class tan iki farkli object olusturunuz
		Her objectle instance variable lara rakam ekleyiniz
		*/
		
		StaticVariable obj1 = new StaticVariable();
		System.out.println(num1);
		System.out.println(obj1.num2);
		
		num1 += 15;
		obj1.num2 += 15;
		System.out.println(num1);
		System.out.println(obj1.num2);
		
		StaticVariable obj2 = new StaticVariable();
		num1 += 15;
		obj2.num2 += 15;
		System.out.println(num1);
		System.out.println(obj2.num2);
	}

}
