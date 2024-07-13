package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("Class A abc() Method");
	}
	
	class B {
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}
}
public class CeateObjectAndAccessMember {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); //innerclass instance
		b.bcd();
	}
}
