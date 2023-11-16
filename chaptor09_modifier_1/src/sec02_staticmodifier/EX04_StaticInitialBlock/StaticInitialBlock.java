package sec02_staticmodifier.EX04_StaticInitialBlock;

class A{
	int a ;
	static int b=1;
	static {
		b = 5;
		System.out.println("Class A Load");
	}
	A(){
		a=3;
		System.out.println("Class A Constructor");
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b); //Constructor doesn't work
		
		A a = new A(); //static -> constructor
		System.out.println(a.a);
	}
}
