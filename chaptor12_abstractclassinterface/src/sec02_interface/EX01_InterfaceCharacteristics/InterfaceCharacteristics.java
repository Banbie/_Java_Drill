package sec02_interface.EX01_InterfaceCharacteristics;

interface A {
	public static final int a = 3; //default modifier
	public abstract void abc();//default modifier
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		System.out.println(A.a);
	}
}
