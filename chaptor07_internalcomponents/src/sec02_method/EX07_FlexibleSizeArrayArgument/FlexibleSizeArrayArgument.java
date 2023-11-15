package sec02_method.EX07_FlexibleSizeArrayArgument;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		method1(1,2,3,4,5,6);
		method1("Hi","Hello","Nice","To","Meet","You");
	}
	
	public static void method1(int...value) {
		System.out.println("length : "+value.length);
		
		for(int k : value) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	public static void method1(String...value) {
		System.out.println("length : "+value.length);
		
		for(String s : value) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
