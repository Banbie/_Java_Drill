package sec02_set.EX01_HashSetMethod;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>();
		
		// 1. add(E element)
		hSet1.add("A");
		hSet1.add("B");
		hSet1.add("C");
		System.out.println(hSet1.toString());
		
		// 2. addAll(other object)
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("B");
		hSet2.add("C");
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString());
		
		// 3. remove(Object o)
		hSet2.remove("B");
		System.out.println(hSet2.toString());
		
		// 4. clear()
		hSet2.clear();
		System.out.println(hSet2.toString());
		
		// 5. isEmpty()
		System.out.println(hSet2.isEmpty());
		
		// 6. contains (Object o)
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("A");
		hSet3.add("B");
		hSet3.add("C");
		System.out.println(hSet3.contains("B"));
		System.out.println(hSet3.contains("E"));
		
		// 7. size()
		System.out.println(hSet3.size());
		
		// 8. iterator()
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		// 10-1. toArray(T[] t)
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		// 10-2. toArray(T[] t)
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
	}
}
