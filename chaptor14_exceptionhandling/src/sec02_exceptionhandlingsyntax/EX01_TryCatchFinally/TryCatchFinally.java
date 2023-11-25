package sec02_exceptionhandlingsyntax.EX01_TryCatchFinally;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
			System.out.println("Tried");
		} 
		catch (ArithmeticException e) {
			System.out.println("can't divide zero");
		}
		
		try {
			System.out.println(3/0);
			System.out.println("Tried");
		}
		catch (ArithmeticException e) {
			System.out.println("can't divide zero");
		}
		finally {
			System.out.println("program quit");
		}
	}
}
