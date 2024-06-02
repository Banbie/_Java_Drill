package sec01_list.EX04_VectorMethod;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


public class VectorMethod {
	public static void main(String[] args) {
		List<Integer> aVector1 = new Vector<>();
		
		// 1. add(E)
		aVector1.add(3);
		aVector1.add(4);
		aVector1.add(5);
		System.out.println(aVector1.toString());
		
		// 2. add(int index, E)
		aVector1.add(1, 6);
		System.out.println(aVector1.toString());
		
		// 3. addAll(Object)
		List<Integer> aVector2 = new Vector<Integer>();
		aVector2.add(1);
		aVector2.add(2);
		aVector2.addAll(aVector1);
		System.out.println(aVector2);
		
		// 4. addAll(int index, Object)
		List<Integer> aVector3 = new Vector<Integer>();
		aVector3.add(1);
		aVector3.add(2);
		aVector3.addAll(1, aVector3);
		System.out.println(aVector3);
		
		// 5. set(int index, E)
		aVector3.set(1,  5);
		aVector3.set(3,  6);
//		aVector3.set(4,  7); // java.lang.IndexOutOfBoundsException;
		System.out.println(aVector3);
		
		// 6. remove(int index)
		aVector3.remove(1);
		System.out.println(aVector3);
		
		// 7. remove(Object o)
		aVector3.remove(2); // object의 경우 new Integer(2) 이런식으로 object 자체의 값을 입려해줘야 됨
		System.out.println(aVector3);
		
		// 8. clear()
		aVector3.clear();
		System.out.println(aVector3);
		
		// 9. isEmpty()
		System.out.println(aVector3.isEmpty());
		
		// 10. size()
		System.out.println(aVector3.size());
		aVector3.add(1);
		aVector3.add(2);
		aVector3.add(3);
		System.out.println(aVector3);
		System.out.println(aVector3.size());
		
		// 11. get(int index)
		System.out.println("first: " + aVector3.get(0));
		System.out.println("Second: " + aVector3.get(1));
		System.out.println("Third: " + aVector3.get(2));
		for(int i =0; i<aVector3.size(); i++)
			System.out.println(i + " 번째: " + aVector3.get(i));
		
		// 12. toArray() List -> Array
		Object[] object = aVector3.toArray(); // 항상 최상위 클래스인 Object로 반환한다
		System.out.println(Arrays.toString(object));
		
		// 13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = aVector3.toArray(new Integer[0]); // 매개변수가 List의 크기보다 작을 경우 List의 갯수 만큼 확장한 배열 반환
		System.out.println(Arrays.toString(integer1));
		
		// 13-2. toArray(T[] t) -> T[]
		Integer[] integer2 = aVector3.toArray(new Integer[5]); // 매개변수가 List의 크기보다 클 경우 매개변수의 size() 만큼의 배열의 생성 null로 채움
		System.out.println(Arrays.toString(integer2));
	}
}
