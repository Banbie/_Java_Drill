package sec01_lambdaexpression.EX07_RefOfInstanceMehtod_Type2_2;

interface A {
	int abc(String str);
}
public class RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		// 2. 람다식
		A a2 = (String str) -> str.length();
		// 3. 자바가 제공하는 인스턴스 메소드 참조
		A a3 = String::length;
		System.out.println(a1.abc("Hi"));
		System.out.println(a2.abc("Hi"));
		System.out.println(a3.abc("Hi"));
	}
}
