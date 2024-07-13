package sec02_typecasting.EX02_Typecasting_2;

class A{
	int m = 3;
	void abc() {
		System.out.println("Class A");
	}
}

class B extends A{
	int n = 4;
	void bcd() {
		System.out.println("Class B");
	}
}

public class Typecasting_2 {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		A ab = new B(); //variable type a = memory type b
		System.out.println(ab.m);
		ab.abc();
		
		B castedA = (B) ab; //downcasting
		System.out.println(castedA.n); //using method Type B
		castedA.bcd();
	}
}
