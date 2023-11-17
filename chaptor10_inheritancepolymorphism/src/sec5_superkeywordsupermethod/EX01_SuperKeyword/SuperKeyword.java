package sec5_superkeywordsupermethod.EX01_SuperKeyword;

class A {
	void abc() {
		System.out.println("Class A abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("Class B abc()");
	}
	void bcd() {
		abc();
	}
	void cde() {
		super.abc();
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		B bb = new B();
		
		bb.bcd();
		bb.cde();
	}
}
