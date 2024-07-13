package sec02_typecasting.EX03_Typecasting_3;

class A {}
class B extends A{}

public class Typecasting_3 {
	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa casted to B");
		} else {
			System.out.println("aa can't cast to B");
		}
		
		if(ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab casted to B");
		} else {
			System.out.println("ab can't cast to B");
		}
		
		if("Hi" instanceof String) {
			System.out.println("\"Hi\" is String class");
		}
	}
}
