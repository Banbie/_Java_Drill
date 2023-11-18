package sec06_objectclass.EX01_ObjectMethod_toString;

class A {
	int a = 3;
	int b = 4;
}

class B {
	int a = 3;
	int b = 4;
	
	public String toString() {
		return "Field value(a, b) = " + a + ", " + b;
	}
}
public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.printf("%X\n", a.hashCode());
		System.out.println(a.toString());
		System.out.println(b);
	}
}
