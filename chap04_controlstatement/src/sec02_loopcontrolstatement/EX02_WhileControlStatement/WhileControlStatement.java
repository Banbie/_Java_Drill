package sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {
	public static void main(String[] args) {
		int a = 0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		int b = 0;
		while(true) {
			//System.out.print(b + " "); // 11까지 찍힘
			if(b>10) {
				break;
			}
			System.out.print(b + " ");
			b++;
		}
	}
}
