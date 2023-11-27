package sec04_userexception.EX02_ExceptionMethod_1;

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new Exception("exception");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
