package sec04_overlapmember.EX03_OverlapStaticMethod;

class A {
	static void print() {
		System.out.println("Class A");
	}
}

class B extends A {
	static void print() {
		System.out.println("Class B");
	}
}

public class OverlapStaticMethod {
	public static void main(String[] args) {
		A.print();
		B.print();
		System.out.println();
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		aa.print();
		bb.print();
		ab.print();
	}
}
