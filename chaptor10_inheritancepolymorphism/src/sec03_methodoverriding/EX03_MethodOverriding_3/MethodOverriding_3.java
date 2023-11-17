package sec03_methodoverriding.EX03_MethodOverriding_3;

class A{
	void print1() {
		System.out.println("Class A print1");
	}
	void print2() {
		System.out.println("Class A print2");
	}
}

class B extends A{
	void print1() {
		System.out.println("Class B print1");
	}
	void print2(int a) {
		System.out.println("Class B print2");
	}
}

public class MethodOverriding_3 {
	public static void main(String[] args) {
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(1);
		System.out.println();
		
		A ab = new B();
		ab.print1();
		ab.print2();
	}
}
