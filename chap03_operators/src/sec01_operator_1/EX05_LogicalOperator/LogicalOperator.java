package sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리 연산자
		//@AND(&&)
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true&&(5<3));
		System.out.println((5<=5)&&(7>2));
		System.out.println();
		
		//@OR(||)
		System.out.println(true||true); //쇼트 서킷에 dead code
		System.out.println(true||false); //쇼트 서킷에 dead code
		System.out.println(true||(5<3)); //쇼트 서킷에 dead code
		System.out.println((5<=5)||(7>2)); //쇼트 서킷에 dead code
		System.out.println();
		
		
		//@XOR(^)
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(true^(5<3));
		System.out.println((5<=5)^(7>2));
		System.out.println();
		
		//@NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(true||!(5<3)); //쇼트 서킷에 dead code
		System.out.println((5<=5)||!(7>2)); //쇼트 서킷에 dead code
		System.out.println();
		
		//비트 연산자 논리 연산
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|(5<3));
		System.out.println((5<=5)|(7>2));
		System.out.println();
		
		//@쇼트서킷 사용
		int value1 = 3;
		System.out.println(false&&++value1>6); //쇼트 서킷에 dead code
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false&++value2>6);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true||++value3>6); //쇼트 서킷에 dead code
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true|++value4>6);
		System.out.println(value4);
		
		
	}
}
