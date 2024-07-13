package sec06_objectclass.EX02_ObjectMethod_equals;

class A {
	String name;
	A(String name){
		this.name = name;
	}
}

class B {
	String name;
	B(String name){
		this.name = name;
	}
	public boolean equals(Object obj) { //Object.equals() overriding
		if(this.name == ((B)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}
public class ObjectMethod_equals {
	public static void main(String[] args) {
		A a1 = new A("Hi");
		A a2 = new A("Hi");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.name.equals(a2.name));
		System.out.println();
		
		B b1 = new B("Hello");
		B b2 = new B("Hello");
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
	}
}
