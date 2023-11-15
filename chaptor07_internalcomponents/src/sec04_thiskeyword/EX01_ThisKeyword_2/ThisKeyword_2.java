package sec04_thiskeyword.EX01_ThisKeyword_2;

class A{
	int m;
	int n;
	void init(int m, int n) {
		//m = m; //dead code
		//n = n; //dead code
	}
}

class B{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class ThisKeyword_2 {
	public static void main(String[] args) {
		A a = new A();
		a.init(2, 3);
		System.out.println(a.m);
		System.out.println(a.n);
		
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
	}
}
