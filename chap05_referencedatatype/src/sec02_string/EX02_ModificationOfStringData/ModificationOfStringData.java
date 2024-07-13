package sec02_string.EX02_ModificationOfStringData;

import java.util.Arrays;

public class ModificationOfStringData {
	public static void main(String[] args) {
		//String ref type
		String str1 = new String("Hi");
		String str2 = str1;
		
		str1 = "Hello"; //change str1 value
		System.out.println(str1);
		System.out.println(str2);
		
		//Array ref type
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		
		//change array1 value
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	}
}
