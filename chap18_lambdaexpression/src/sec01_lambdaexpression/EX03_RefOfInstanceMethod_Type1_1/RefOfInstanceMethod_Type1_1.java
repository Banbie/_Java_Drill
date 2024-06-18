package sec01_lambdaexpression.EX03_RefOfInstanceMethod_Type1_1;

interface A {
	void abc();
}
class B {
	void bcd() {
		System.out.println("Method");
	}
}
public class RefOfInstanceMethod_Type1_1 {
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
		A a3 = b::bcd; // A 인터페이스 내부의 abc() 메서드는 참조 변수 b 내부 인스턴스 bcd()와 동일하다 -> 리턴 타입, 매개변수의 타입이 반드시 동일해야함
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
