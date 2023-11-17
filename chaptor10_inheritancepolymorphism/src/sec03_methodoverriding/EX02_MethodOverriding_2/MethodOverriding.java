package sec03_methodoverriding.EX02_MethodOverriding_2;

class Animal{
	void cry() {}
}

class Bird extends Animal{
	void cry() {
		System.out.println("Beep Beep");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("Myaoo");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("Bau Wau");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		Animal[] animals = {ab, ac, ad};
		for(Animal a : animals) {
			a.cry();
		}
	}
}
