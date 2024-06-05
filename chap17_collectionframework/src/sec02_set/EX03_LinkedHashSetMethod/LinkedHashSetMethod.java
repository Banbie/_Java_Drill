package sec02_set.EX03_LinkedHashSetMethod;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetMethod {
	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<>();
		// 1. add(E element)
		linkedSet1.add("A");
		linkedSet1.add("B");
		linkedSet1.add("A");
		System.out.println(linkedSet1.toString());
		
		// 2. addAll(other set object)
		Set<String> linkedSet2 = new LinkedHashSet<>();
		linkedSet2.add("B");
		linkedSet2.add("C");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2.toString());
		
		// 3. remove(Object o)
		linkedSet2.remove("B");
		System.out.println(linkedSet2.toString());
		
		// 4. clear()
		linkedSet2.clear();
		System.out.println(linkedSet2.toString());
		
		// 5. isEmpty()
		System.out.println(linkedSet2.isEmpty());
		
		// 6. contains()
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("A");
		linkedSet3.add("B");
		linkedSet3.add("C");
		System.out.println(linkedSet3.contains("B"));
		System.out.println(linkedSet3.contains("D"));
		
		// 7. size()
		System.out.println(linkedSet3.size());
		
		// 8. iterator()
		Iterator<String> iterator = linkedSet3.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		// 9. toArray()
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		// 10-1 toArray(T[] t)
		String[] strArray1 = linkedSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		// 10-2 toArray(T[] t)
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
	}
}
