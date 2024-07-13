package sec01_instanceinnerclass.EX02_UseMembersOfOuterClass;

class A {
	String a = "Class A Field a";
	String b = "Class A Field b";
	void abc() {
		System.out.println("Class A Method");
	}
	
	class B {
		String a = "Class B Field a";
		String b = "Class B Field b";
		void abc() {
			System.out.println("Class B Method");
		}
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			abc();
			
			System.out.println(A.this.a); //outer class field call
			System.out.println(A.this.b);
			A.this.abc(); //outer class method call
		}
	}
}
public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.bcd();
	}
}
