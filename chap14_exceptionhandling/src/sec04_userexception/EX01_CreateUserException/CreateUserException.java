package sec04_userexception.EX01_CreateUserException;

class MyException extends Exception {
	public MyException() {
		super();
	}
	
	public MyException(String msg) {
		super(msg);
	}
}

class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}
	
	public MyRTException(String msg) {
		super(msg);
	}
}

class A {
	MyException me1 = new MyException();
	MyException me2 = new MyException("exception : MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("exception : MyRTException");
	
	void abc_1(int num) {
		try {
			if(num>70)
				System.out.println("Ordered");
			else
				throw me1;
		}
		catch (MyException e) {
			System.out.println("exception 1");
		}
	}
	
	void bcd_1() {
		abc_1(65);
	}
	
	void abc_2(int num) throws MyException {
		if(num>70)
			System.out.println("Ordered");
		else
			throw me2;
	}
	void bcd_2() {
		try {
			abc_2(65);
		}
		catch (MyException e) {
			System.out.println("exception 2");
		}
	}
}

public class CreateUserException {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();
		a.bcd_2();
	}
}
