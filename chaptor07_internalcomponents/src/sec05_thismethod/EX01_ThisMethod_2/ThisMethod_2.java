package sec05_thismethod.EX01_ThisMethod_2;

class A {
	int m1, m2, m3, m4;
	
	A(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A(int m1){
		this();
		this.m1 = m1;
	}
	
	A(int m1, int m2){
		this(m1);
		this.m2 = m2;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

public class ThisMethod_2 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10,20);
		a1.print();
		a2.print();
		a3.print();
		
	}
}
