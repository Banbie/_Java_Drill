package sec04_anonymousclass.EX02_AnonymousClassInputParameter;

interface A {
	public abstract void abc();
}

class B implements A {
	public void abc() {
		System.out.println("Input Parameter Class");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClassInputParameter {
	public static void main(String[] args) {
		C c = new C();
		A a = new B();
		c.cde(a); // Class O, Variable O
		
		c.cde(new B()); //Class O, Variable X
		
		A a1 = new A() { //Class X, Variable O
			public void abc() {
				System.out.println("Input Parameter Class");
			}
		};
		c.cde(a1);
		
		c.cde(new A() { //Class X, Variable X
			public void abc() {
				System.out.println("Input Parameter Class");
			}
		});
		
	}
}
