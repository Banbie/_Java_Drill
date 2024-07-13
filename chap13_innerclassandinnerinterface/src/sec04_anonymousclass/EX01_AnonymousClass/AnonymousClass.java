package sec04_anonymousclass.EX01_AnonymousClass;

class A {
	B b = new B();
	C c2 = (C) b;
	C c1 = new C() {
		public void bcd() {
			System.out.println("Anonymous InnerClass");
			addedMethod(); //only call inner method
		}
		public void addedMethod() {
			System.out.println("Anonymous InnerClass addedMethod");
		}
	};
	
	void abc() {
		b.bcd();
		b.addedMethod();
		System.out.println();
		c1.bcd();
		System.out.println();
		c2.bcd();
	}
	class B implements C {
		public void bcd() {
			System.out.println("Instance InnerClass");
		}
		public void addedMethod() {
			System.out.println("Instance InnerClass addedMethod");
		}
	}
}

interface C {
	public abstract void bcd();
}

public class AnonymousClass {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
