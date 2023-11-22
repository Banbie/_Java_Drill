package sec04_anonymousclass.EX01_AnonymousClass;

class A {
	C c1 = new B();
	
	C c2 = new C() {
		public void bcd() {
			System.out.println("Anonymous InnerClass");
		}
	};
	
	void abc() {
		c1.bcd();
		
		c2.bcd();
	}
	class B implements C {
		public void bcd() {
			System.out.println("Instance InnerClass");
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
