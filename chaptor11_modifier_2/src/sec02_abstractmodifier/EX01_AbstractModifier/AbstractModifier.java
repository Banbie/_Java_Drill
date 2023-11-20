package sec02_abstractmodifier.EX01_AbstractModifier;

//class Animal {
//	void cry() {}
//}

abstract class Animal{
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("Meyo");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("Bau");
	}
}

public class AbstractModifier {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}
}
