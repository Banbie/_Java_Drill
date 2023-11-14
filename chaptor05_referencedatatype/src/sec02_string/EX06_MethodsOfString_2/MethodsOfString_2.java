package sec02_string.EX06_MethodsOfString_2;

import java.util.Arrays;

public class MethodsOfString_2 {
	public static void main(String[] args) {
		//@toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		//@replace()
		System.out.println(str1.replace("Study", "공부"));
		
		//@substring()
		System.out.println(str1.substring(2,4));
		
		//@split()
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		//@trim()
		System.out.println("     trim     ".trim());
		System.out.println();
		
		//compare String
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//@stack memory compare (point address)
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		//@equals(), equalsIgnoreCase() : heap memory data compare (value data)
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
	}
}
