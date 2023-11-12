package sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		int[] array = new int [] {3, 4, 5, 6, 7};
		
		//length
		System.out.println(array.length);
		
		//output1
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
		System.out.println();
		
		//output2
		for(int i =0; i<5; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		//output3
		for(int k: array) { //for each
			System.out.print(k+" ");
		}
		System.out.println();
		
		//output4
		System.out.println(Arrays.toString(array)); //toString method
	}
}
