package sec01_inheritancepolymorphism.EX02_Polymorphism;

class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		
		C c1 = new C();
		
		D d1 = new D();
	}
}
