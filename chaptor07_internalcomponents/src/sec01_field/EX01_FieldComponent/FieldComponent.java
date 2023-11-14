package sec01_field.EX01_FieldComponent;

class A{
	int m = 3; //field (heap)
	int n = 4; //field (heap)
	void work1() {
		int k = 5; //local (stack)
		System.out.println(k);
		work2(3);
	}
	
	void work2(int i) {
		int j = 4; //local (stack)
		System.out.println(i+j);
	}
}

public class FieldComponent {
	public static void main(String[] args) {
		A a = new A(); //instance
		System.out.println(a.m); //call heap memory
		System.out.println(a.n); //call heap memory
		a.work1(); //call stack memory
	}
}
