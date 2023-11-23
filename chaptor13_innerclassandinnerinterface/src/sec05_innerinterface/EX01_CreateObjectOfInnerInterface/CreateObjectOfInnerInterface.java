package sec05_innerinterface.EX01_CreateObjectOfInnerInterface;

class A {
	interface B {
		public abstract void bcd();
	}
}

class C implements A.B {
	public void bcd() {
		System.out.println("InnerInterface Implement Class Instance");
	}
}

public class CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		//A.B ab = new C();
		C c = new C();
		c.bcd();
		System.out.println();
		
		A.B b = new A.B() {
			public void bcd() {
				System.out.println("Anonymous InnerClass Implement Objcet");
			}
		};
		b.bcd();
		
	}
}

