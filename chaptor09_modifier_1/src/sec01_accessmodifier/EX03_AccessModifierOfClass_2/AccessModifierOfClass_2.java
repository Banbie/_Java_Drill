package sec01_accessmodifier.EX03_AccessModifierOfClass_2;

import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB; //access deny default class
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC; //public class

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		AA a = new AA();
		//BB b = new BB(); //access deny 
		//CC c = new CC(); //access deny default constructor (public class)
	}
}
