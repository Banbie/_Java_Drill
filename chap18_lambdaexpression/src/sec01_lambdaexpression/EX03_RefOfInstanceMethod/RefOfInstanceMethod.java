package sec01_lambdaexpression.EX03_RefOfInstanceMethod;

interface A {
	void abc();
}
class B {
	void bcd() {
		System.out.println("Method");
	}
}
public class RefOfInstanceMethod {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		// 2. 람다식
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		// 3. 정의된 인스턴스 참조
		B b = new B();
		A a3 = b::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
