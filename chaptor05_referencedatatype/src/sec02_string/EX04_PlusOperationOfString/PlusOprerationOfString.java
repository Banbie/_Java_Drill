package sec02_string.EX04_PlusOperationOfString;

public class PlusOprerationOfString {
	public static void main(String[] args) {
		//String+String
		String str1 = "He"+"llo"+"!";
		System.out.println(str1);
		
		String str2 = "Nice";
		str2 += " to meet you";
		str2 += "!";
		System.out.println(str2);
		System.out.println();
		
		//String+Pridatatype
		String str3 = "Hi"+1;
		String str4 = "Hi"+String.valueOf(1);
		String str5 = "Hi"+"1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		//mix
		System.out.println(1+"Hi");
		System.out.println(1+"Hi"+2);
		System.out.println("Hi"+1+2);
		System.out.println(1+2+"Hi"); //calculate fifo -> 3Hi
		
	}
}
