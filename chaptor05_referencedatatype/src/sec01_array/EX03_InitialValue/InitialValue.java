package sec01_array.EX03_InitialValue;

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		//stack memory
		int value1; //dead code
		//System.out.println(value1); -> output impossible no data for heap
		int[] value2; //dead code
		//System.out.println(value2); -> output impossible no data for heap
		
		//explicit  init heap 
		int value3 = 0;
		System.out.println(value3);
		int[] value4 = null;
		System.out.println(value4);
		
		System.out.println();
		
		//implicit init heap
		//value type
		boolean[] array1 = new boolean[3];
		for(int i =0; i<3; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		int[] array2 = new int[3];
		for(int i =0; i<3; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		double[] array3 = new double[3];
		for(int i =0; i<3; i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		//reference type
		String[] array4 = new String[3];
		for(int i =0; i<3; i++) {
			System.out.print(array4[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}
}
