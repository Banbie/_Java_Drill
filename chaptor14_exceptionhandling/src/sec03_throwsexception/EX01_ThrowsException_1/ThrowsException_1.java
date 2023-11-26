package sec03_throwsexception.EX01_ThrowsException_1;

class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			
		}
	}
}

class B {
	void abc() {
		try {
			bcd();
		}
		catch (InterruptedException e) {
			
		}
	}
	
	void bcd() throws InterruptedException { //exception handling throw to implement part
		Thread.sleep(1000);
	}
}
public class ThrowsException_1 {

}
