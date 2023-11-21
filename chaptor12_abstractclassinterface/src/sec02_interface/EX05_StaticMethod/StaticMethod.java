package sec02_interface.EX05_StaticMethod;

interface A {
	static void abc() {
		System.out.println("Interface A Static Method");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A.abc();
	}
}
