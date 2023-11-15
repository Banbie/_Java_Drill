package sec02_method.EX04_EffectOfPrimaryDataArgument;

public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
		int a = 3; //stack
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
	}
	
	public static int twice(int a) {
		a = a*2; //stack
		return a;
	}
}
