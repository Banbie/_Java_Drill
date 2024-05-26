package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;

class A {}
class B extends A {}
class C extends B {}

class D <T extends B> { // B와 C만 객체 생성 가능
	private T t ;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGenericClass {
	public static void main(String[] args) {
		// D<A> d1 = new D<>(); // impossible
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();
		
		d2.set(new B());
		d2.set(new C());
		
		// d3.set(new B()); // type C를 지정 불가능
		d3.set(new C());
		
		d4.set(new B()); // 가능한 최상위 클래스 입력된 것으로 암묵적 간주
		d4.set(new C());
	}
}
