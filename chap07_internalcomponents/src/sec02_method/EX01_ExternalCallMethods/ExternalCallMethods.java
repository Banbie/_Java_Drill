package sec02_method.EX01_ExternalCallMethods;

class A {
	void print() {
		System.out.println("Hi");
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a, double b) {
		return a+b;
	}
	
	void prinMonth(int m) {
		if(m<0||m>12) {
			System.out.println("input error");
			return;
		}
		System.out.println(m+" month");
	}
}

public class ExternalCallMethods {
	public static void main(String[] args) {
		A a = new A();
		a.print();
		int k = a.data();
		//a.data();
		System.out.println(k);
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.prinMonth(5);
		a.prinMonth(15);
		
	}
}
