package sec01_lambdaexpression.EX08_RefOfArrayConstructor;

interface A {
	int[] abc(int len);
}
public class RefOfArrayConstructor {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public int[] abc(int len) {
				return new int[len];
			}
		};
		// 2. 람다식
		A a2 = (int len) -> {return new int[len];};
		// 3. 배열의 생성자 참조
		A a3 = int[]::new;
		int[] array1 = a1.abc(3);
		System.out.println(array1.length);
		int[] array2 = a2.abc(3);
		System.out.println(array2.length);
		int[] array3 = a3.abc(3);
		System.out.println(array3.length);
	}
}
