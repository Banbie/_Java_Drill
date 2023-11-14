package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

//outer class
class A {
	int m = 3;
	void print() {
		System.out.println("Object Create and Use");
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		//object create
		A a = new A();
		
		//field
		a.m = 5;
		System.out.println(a.m);
		
		//method
		a.print();
	}

}
