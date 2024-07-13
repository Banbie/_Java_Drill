package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {

	public void print() {
		//no need instance
		System.out.print(a + " ");
		System.out.print(b + " ");
		//System.out.print(c + " "); //access deny default(package)
		//System.out.print(d); //access deny private
		System.out.println();
	}
}
