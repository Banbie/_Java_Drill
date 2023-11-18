package sec5_superkeywordsupermethod.EX04_SuperMethod_2;

class A {
	A(){
		this(3);
		System.out.println("Class A default Constructor");
	}
	A(int i){
		System.out.println("Class A Overloaded Constructor");
	}
}

class B extends A {
	B(){
		this(3);
		System.out.println("Class B defualt Constructor");
	}
	B(int i){
		System.out.println("Class B Overloaded Constructor");
	}
}

public class SuperMethod_2 {
	public static void main(String[] args) {
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();
		
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3); //write just default super constructor 
	}
}
