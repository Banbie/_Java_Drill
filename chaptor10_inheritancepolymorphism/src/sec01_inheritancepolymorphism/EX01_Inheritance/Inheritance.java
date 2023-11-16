package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "Kwon";
		h.age = 11;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "Kang";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "Bong";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
	}
}
