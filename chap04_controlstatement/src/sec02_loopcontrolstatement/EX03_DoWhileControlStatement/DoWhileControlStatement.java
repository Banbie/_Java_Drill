package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		int a = 0;
		do {
			System.out.print(a+" ");
			a++;
		}
		while(false); //loop의 첫번째 회차는 반드시 시행
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}
		while(a<10); //loop의 첫번째 회차가 두번 반복되는 것 아님
	}
}
