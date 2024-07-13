package sec02_staticmodifier.EX01_StaticField_1;

class A {
	int m = 3;
	static int n = 5;
}

public class StaticField_1 {
	public static void main(String[] args) {
		A a1 = new A(); //instance
		System.out.println(a1.m); //call field
		
		System.out.println(A.n); //no need to instance call field directly
	}
}
