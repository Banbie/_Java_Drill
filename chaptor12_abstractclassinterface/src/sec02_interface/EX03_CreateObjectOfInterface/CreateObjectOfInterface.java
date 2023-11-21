package sec02_interface.EX03_CreateObjectOfInterface;

interface A {
	int a =3;
	void abc();
}

class B implements A {
	public void abc() {
		System.out.println("SubClass Object Instance");
	}
}
public class CreateObjectOfInterface {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
		
		A a = new A() {
			public void abc() {
				System.out.println("InnerClass Object Instance");
			}
		};
		a.abc();
	}
}
