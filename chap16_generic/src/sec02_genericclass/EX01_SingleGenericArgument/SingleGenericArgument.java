package sec02_genericclass.EX01_SingleGenericArgument;

class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {
	public static void main(String[] args) {
		// 객체 생성할 때 타입 지정
		MyClass<String> mc1 = new MyClass<>();
		mc1.set("Hi");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.set("HI"); // 강한 타입 오류
	}
}
