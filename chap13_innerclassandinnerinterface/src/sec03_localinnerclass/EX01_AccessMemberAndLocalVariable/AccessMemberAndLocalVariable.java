package sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

class A {
	int a = 3;
	void abc() { //localclass call field must be write static memory(final modifier) cus method code can be deleted
		int b = 5;
		
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b); //localclass call localvariable will added "final"modifier
				a = 5;
				//b = 7;
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
