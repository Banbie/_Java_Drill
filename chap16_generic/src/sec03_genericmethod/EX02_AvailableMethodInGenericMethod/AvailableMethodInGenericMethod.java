package sec03_genericmethod.EX02_AvailableMethodInGenericMethod;

class A {
	public <T> void method(T t) {
		//System.out.println(t.length()); // String method call impossible
		System.out.println(t.equals("Hi")); // Object method
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("Hi");
	}
}
