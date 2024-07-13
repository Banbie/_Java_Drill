package sec01_operator_1.EX04_RelationOperator;

public class RelationOperator {
	public static void main(String[] args) {
		//크기 비교
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<2);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		//등가 비교
		//@기본 자료형 등가 비교
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		//@참조 자료형 등가 비교
		String str1 = new String("안녕"); //스텍 영역 메모리값 비교 (레퍼런스 주소)
		String str2 = new String("안녕");
		
		System.out.println(str1==str2);
	}
}
