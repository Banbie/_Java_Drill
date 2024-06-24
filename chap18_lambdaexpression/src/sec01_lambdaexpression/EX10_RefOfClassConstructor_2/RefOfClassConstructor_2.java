package sec01_lambdaexpression.EX10_RefOfClassConstructor_2;

interface A {
	B abc(int k);
}
class B {
	B() {
		System.out.println("first constructor");
	}
	B(int k) {
		System.out.println("second constructor");
	}
}
public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};
		// 2. 람다식
		A a2 = (int k) -> new B(3);
		// 3. 클래스 생성자 참조
		A a3 = B::new;
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}
}
