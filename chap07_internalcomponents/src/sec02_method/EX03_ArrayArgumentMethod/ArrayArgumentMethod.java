package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		int [] a = new int[] {1, 2, 3};
		printArray(a);
		printArray(new int [] {1,2,3});
		//printArray({1,2,3}); //error heap memory instance
	}
	
	public static void printArray(int [] a) {
		System.out.println(Arrays.toString(a));
	}
}
