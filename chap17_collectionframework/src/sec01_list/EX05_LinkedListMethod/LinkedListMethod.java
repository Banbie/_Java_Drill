package sec01_list.EX05_LinkedListMethod;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class LinkedListMethod {
	public static void main(String[] args) {
		List<Integer> aLinkedList1 = new LinkedList<>();
		
		// 1. add(E)
		aLinkedList1.add(3);
		aLinkedList1.add(4);
		aLinkedList1.add(5);
		System.out.println(aLinkedList1.toString());
		
		// 2. add(int index, E)
		aLinkedList1.add(1, 6);
		System.out.println(aLinkedList1.toString());
		
		// 3. addAll(Object)
		List<Integer> aLinkedList2 = new LinkedList<Integer>();
		aLinkedList2.add(1);
		aLinkedList2.add(2);
		aLinkedList2.addAll(aLinkedList1);
		System.out.println(aLinkedList2);
		
		// 4. addAll(int index, Object)
		List<Integer> aLinkedList3 = new LinkedList<Integer>();
		aLinkedList3.add(1);
		aLinkedList3.add(2);
		aLinkedList3.addAll(1, aLinkedList3);
		System.out.println(aLinkedList3);
		
		// 5. set(int index, E)
		aLinkedList3.set(1,  5);
		aLinkedList3.set(3,  6);
//		aLinkedList3.set(4,  7); // java.lang.IndexOutOfBoundsException;
		System.out.println(aLinkedList3);
		
		// 6. remove(int index)
		aLinkedList3.remove(1);
		System.out.println(aLinkedList3);
		
		// 7. remove(Object o)
		aLinkedList3.remove(2); // object의 경우 new Integer(2) 이런식으로 object 자체의 값을 입려해줘야 됨
		System.out.println(aLinkedList3);
		
		// 8. clear()
		aLinkedList3.clear();
		System.out.println(aLinkedList3);
		
		// 9. isEmpty()
		System.out.println(aLinkedList3.isEmpty());
		
		// 10. size()
		System.out.println(aLinkedList3.size());
		aLinkedList3.add(1);
		aLinkedList3.add(2);
		aLinkedList3.add(3);
		System.out.println(aLinkedList3);
		System.out.println(aLinkedList3.size());
		
		// 11. get(int index)
		System.out.println("first: " + aLinkedList3.get(0));
		System.out.println("Second: " + aLinkedList3.get(1));
		System.out.println("Third: " + aLinkedList3.get(2));
		for(int i =0; i<aLinkedList3.size(); i++)
			System.out.println(i + " 번째: " + aLinkedList3.get(i));
		
		// 12. toArray() List -> Array
		Object[] object = aLinkedList3.toArray(); // 항상 최상위 클래스인 Object로 반환한다
		System.out.println(Arrays.toString(object));
		
		// 13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = aLinkedList3.toArray(new Integer[0]); // 매개변수가 List의 크기보다 작을 경우 List의 갯수 만큼 확장한 배열 반환
		System.out.println(Arrays.toString(integer1));
		
		// 13-2. toArray(T[] t) -> T[]
		Integer[] integer2 = aLinkedList3.toArray(new Integer[5]); // 매개변수가 List의 크기보다 클 경우 매개변수의 size() 만큼의 배열의 생성 null로 채움
		System.out.println(Arrays.toString(integer2));
	}
}
