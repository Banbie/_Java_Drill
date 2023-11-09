package sec01_operator_1.EX07_ConditionalOperator;

public class ConditionalOperator {
	public static void main(String[] args) {
		//ConditionalOperator
		int noDead = 5; //dead code 방지용
		int value1 = (3>noDead)?6:9;
		System.out.println(value1);
		
		int value2 = (3<noDead)?10:20;
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3%2 ==0)? "짝수":"홀수");
		
		//if문 변환
		if(value3%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
