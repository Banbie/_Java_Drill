package sec01_abstractclass.EX01AbstractClass;

abstract class A {
	abstract void abc();
}

class B extends A {
	void abc() {
		System.out.println("implet method in subclass");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		A b1 = new B();
		b1.abc();
		
		A a1 = new A() {
			void abc() {
				System.out.println("implet method in innerclass");
			}
		}; //need semicolon
		a1.abc();
		
	}
}
