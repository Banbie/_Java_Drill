package sec04_userexception.EX04_UserExceptionExample;

class MinusException extends Exception {
	public MinusException() {
		super();
	}
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	public OverException() {
		super();
	}
	
	public OverException(String msg) {
		super(msg);
	}
}

class A {
	void checkScore(int score) throws MinusException, OverException {
		if(score<0) {
			throw new MinusException("MinusException");
		}
		else if(score>100) {
			throw new OverException("OverException");
		}
		else {
			System.out.println("input complete!");
		}
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.checkScore(85);
			a.checkScore(150);
		}
		catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
