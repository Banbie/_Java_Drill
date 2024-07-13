package sec02_staticmodifier.EX02_StaticField_2;

class A {
	int m = 3;
	static int n = 5;
}

public class StaticField_2 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		//instance field
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		//static field
		a1.n = 7;
		a2.n = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}
}
