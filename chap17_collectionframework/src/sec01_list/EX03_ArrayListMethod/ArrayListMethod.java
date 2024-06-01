package sec01_list.EX03_ArrayListMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListMethod {
	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// 1. add(E)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		
		// 2. add(int index, E)
		aList1.add(1, 6);
		System.out.println(aList1.toString());
		
		// 3. addAll(Object)
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		// 4. addAll(int index, Object)
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1, aList3);
		System.out.println(aList3);
		
		// 5. set(int index, E)
		aList3.set(1,  5);
		aList3.set(3,  6);
//		aList3.set(4,  7); // java.lang.IndexOutOfBoundsException;
		System.out.println(aList3);
		
		// 6. remove(int index)
		aList3.remove(1);
		System.out.println(aList3);
		
		// 7. remove(Object o)
		aList3.remove(2); // object의 경우 new Integer(2) 이런식으로 object 자체의 값을 입려해줘야 됨
		System.out.println(aList3);
		
		// 8. clear()
		aList3.clear();
		System.out.println(aList3);
		
		// 9. isEmpty()
		System.out.println(aList3.isEmpty());
		
		// 10. size()
		System.out.println(aList3.size());
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		// 11. get(int index)
		System.out.println("first: " + aList3.get(0));
		System.out.println("Second: " + aList3.get(1));
		System.out.println("Third: " + aList3.get(2));
		for(int i =0; i<aList3.size(); i++)
			System.out.println(i + " 번째: " + aList3.get(i));
		
		// 12. toArray() List -> Array
		Object[] object = aList3.toArray(); // 항상 최상위 클래스인 Object로 반환한다
		System.out.println(Arrays.toString(object));
		
		// 13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = aList3.toArray(new Integer[0]); // 매개변수가 List의 크기보다 작을 경우 List의 갯수 만큼 확장한 배열 반환
		System.out.println(Arrays.toString(integer1));
		
		// 13-2. toArray(T[] t) -> T[]
		Integer[] integer2 = aList3.toArray(new Integer[5]); // 매개변수가 List의 크기보다 클 경우 매개변수의 size() 만큼의 배열의 생성 null로 채움
		System.out.println(Arrays.toString(integer2));
	}
}
