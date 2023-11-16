package sec02_staticmodifier.EX03_StaticMethod;

class A{
	void abc() {
		System.out.println("instance method");
	}
	static void bcd() {
		System.out.println("static method");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();
		
		A.bcd();
	}
}
