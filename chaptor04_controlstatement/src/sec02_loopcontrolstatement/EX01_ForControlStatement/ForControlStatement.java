package sec02_loopcontrolstatement.EX01_ForControlStatement;

public class ForControlStatement {
	public static void main(String[] args) {
		int a;
		for(a = 0; a<3; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i = 0; i<100; i++) {
			System.out.print(i+",");
		}
		System.out.println();
		
		for(int i = 10; i>0; i --) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0, j=0; i<10; i++, j++) {
			System.out.print(i+j+" ");
		}
		System.out.println();
		
		for(int i =0; ; i++) {
			if(i>10) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println("loop end");
	}
}
