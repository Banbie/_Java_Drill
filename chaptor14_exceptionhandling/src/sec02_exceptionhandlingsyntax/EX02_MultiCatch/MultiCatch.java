package sec02_exceptionhandlingsyntax.EX02_MultiCatch;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		catch (ArithmeticException e) {
			System.out.println("can't divide zero");
		}
		finally {
			System.out.println("cal end");
		}
		
		try {
			int num = Integer.parseInt("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("not incorrect integer");
		}
		finally {
			System.out.println("cal end");
		}
		
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}
		catch (ArithmeticException e) {
			System.out.println("can't divide zero");
		}
		catch(NumberFormatException e) {
			System.out.println("not incorrect integer");
		}
		catch(Exception e) { // syntax ordered check
			System.out.println("undefined exception");
		}
		finally {
			System.out.println("cal end");
		}
	}
}
