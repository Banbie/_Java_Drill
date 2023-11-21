package sec02_interface.EX04_DefaultMethod;

interface A {
	void abc();
	default void bcd() {
		System.out.println("Interface A default method");
	}
}

class B implements A {
	public void abc() {
		System.out.println("Class B abc() implement");
	}
}

class C implements A {
	public void abc() {
		System.out.println("Class C abc() implement");
	}
	public void bcd() {
		A.super.bcd();
		System.out.println("Class C bcd() overriding");
	}
}


public class DefaultMethod {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.abc();
		b.bcd();
		System.out.println();
		c.abc();
		c.bcd();
	}
}
