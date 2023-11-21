package sec02_interface.EX02_InheritanceOfInterface;

interface A {
	void abc();
}

interface B {
	void bcd();
}

class C implements A {
	public void abc() { //class default visibility modifier is "default" visibility can't be reduce
		System.out.println("Class C");
	}
}

class D implements A, B {
	public void abc() {}
	public void bcd() {}
}

class E extends C implements A, B {
	//public void abc() {} //overriding
	public void bcd() {}
}

public class InheritanceOfInterface {
	public static void main(String[] args) {
		E e = new E();
		e.abc();
	}
}
