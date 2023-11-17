package sec03_methodoverriding.EX01_MethodOverriding_1;

class A{
	void print() {
		System.out.println("Class A");
	}
}

class B extends A{
	//@override
	void print() {
		System.out.println("Class B");
	}
}

public class MethodOverriding_1 {
	public static void main(String[] args) {
		A aa = new A();
		aa.print();
		
		B bb = new B();
		bb.print();
		
		A ab = new B();
		ab.print();
	}
}
