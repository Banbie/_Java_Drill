package sec5_superkeywordsupermethod.EX02_SuperMethod_1;

class A {
	A(){
		System.out.println("Class A Constructor");
	}
}

class B extends A {
	B(){
		super();
		System.out.println("Class B Constructor");
	}
}

class C {
	C(int i){
		System.out.println("Class C Constructor");
	}
}

class D extends C {
	D(){
		//super(); <- variable error compiler auto input
		super(3);
	}
}

public class SuperMethod_1 {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println();
		
		B bb = new B();
	}
}
