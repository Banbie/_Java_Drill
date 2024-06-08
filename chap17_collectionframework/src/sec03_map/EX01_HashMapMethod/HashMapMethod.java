package sec03_map.EX01_HashMapMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<>();
		// 1. put(K, V)
		hMap1.put(2, "나다라");
		hMap1.put(1, "가나다");
		hMap1.put(3, "다라마");
		System.out.println(hMap1.toString());
		
		// 2. putAll(T t)
		Map<Integer, String> hMap2 = new HashMap<>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString());
		
		// 3. replace(K, V)
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "라라라");
		System.out.println(hMap2.toString());
		
		// 4. replace(K, oldV, newV)
		hMap2.replace(1, "가가가", "나나나");
		hMap2.replace(2,"다다다", "라라라");
		System.out.println(hMap2.toString());
		
		// 5. V get(Object key)
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		// 6. containsKey(Object key)
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		
		// 7. containsValue(Object value)
		System.out.println(hMap2.containsValue("나나나"));
		System.out.println(hMap2.containsValue("다다다"));
		
		// 8. Set<K> keySet()
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet.toString());
		
		// 9. Set<Map.Entry<K, V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet.toString());
		
		// 10. size()
		System.out.println(hMap2.size());
		
		// 11. remove(Object key)
		hMap2.remove(1);
		hMap2.remove(4);
		System.out.println(hMap2.toString());
		
		// 12. remove(Object key, Object value)
		hMap2.remove(2, "나다라");
		hMap2.remove(3, "다다다");
		System.out.println(hMap2.toString());
		
		// 13. clear()
		hMap2.clear();
		System.out.println(hMap2.toString());
		
		
	}
}
