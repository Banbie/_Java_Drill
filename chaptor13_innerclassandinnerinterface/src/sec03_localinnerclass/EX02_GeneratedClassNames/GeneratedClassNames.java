package sec03_localinnerclass.EX02_GeneratedClassNames;

class A { //A.class
	void abc() {
		class B {} //A$1B.class
		class C {} //A$1C.class
	}
	
	void bcd() {
		class C {} //A$2C.class
		class D{} //A$1D.class
	}
}

public class GeneratedClassNames {

}
