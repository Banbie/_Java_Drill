package sec02_string.EX05_MethodsOfString;

import java.util.Arrays;

public class MethodsOfString {
	public static void main(String[] args) {
		//length
		String str1 = "Hello Java!";
		String str2 = "Hi Nice to meet you!";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		//String search
		//@charAt()
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(2));
		System.out.println();
		
		//@indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf('a',8));
		System.out.println(str1.lastIndexOf('a',8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str1.indexOf("Bye")); //return -1
		System.out.println();
		
		//String return & plus
		//@String.valueOf(prime)
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//@concat()
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		//String.valueOf() + concat()
		String str6 = "Hi" + 3;
		String str7 = "Hi".concat(String.valueOf(3));
		
		//@getBytes()
		String str8 = "Hello Java!";
		byte[] array1 = str8.getBytes();
		System.out.println(Arrays.toString(array1));
		char[] array2 = str8.toCharArray();
		System.out.println(Arrays.toString(array2));
	}
}
