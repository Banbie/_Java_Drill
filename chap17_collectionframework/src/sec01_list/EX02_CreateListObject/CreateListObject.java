package sec01_list.EX02_CreateListObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		// 1. List 구현 클래스의 생성자를 사용해 객체 생성
		List<Integer> aList1 = new ArrayList<>(); // default 10
		List<Integer> aList2 = new ArrayList<>(30);
		List<Integer> aList3 = new Vector<>(); // default 10
		List<Integer> aList4 = new Vector<>(30);
		List<Integer> aList5 = new LinkedList<>(); // final default 10
//		List<Integer> aList6 = new LinkedList<>(30); // capacity 지정 불가
		
		// 2. Arrays 클래스의 정적 메서드 활용
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4);
		List<String> aList8 = Arrays.asList("Hi", "Hello");
		aList7.set(1, 7);
		aList8.set(0, "Thanks");
//		aList7.add(5); // 약한 체크 UnsupportedOperationException
//		aList8.remove(0); // 약한 체크
		System.out.println(aList7);
		System.out.println(aList8);
	}
}
