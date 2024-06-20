package sec01_lambdaexpression.EX06_RefOfInstanceMethod_Type2_1;

interface A {
	void abc(B b, int k);
}
class B {
	void bcd(int k) {
		System.out.println(k);
	}
}
public class RefOfInstanceMethod_Type2_1 {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		// 2. 람다식
		A a2 = (B b, int k) -> {b.bcd(k);};
		// 인스턴스 메소드 참조
		A a3 = B::bcd;
		a1.abc(new B(), 3);
		a2.abc(new B(), 3);
		a3.abc(new B(), 3);
	}
}
