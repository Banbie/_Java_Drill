package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class C {
	public void print() {
		A a = new A();
		
		System.out.print(a.a + " ");
		//System.out.print(a.b); //access deny protected
		//System.out.print(a.c); //access deny default(package)
		//System.out.print(a.d); //access deny private
		System.out.println();
	}
}
