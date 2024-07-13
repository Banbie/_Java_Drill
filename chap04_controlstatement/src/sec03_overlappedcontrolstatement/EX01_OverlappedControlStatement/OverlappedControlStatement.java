package sec03_overlappedcontrolstatement.EX01_OverlappedControlStatement;

public class OverlappedControlStatement {
	public static void main(String[] args) {
		//if-if
		int value1 = 5;
		int value2 = 3;
		if(value1 > 5 ) {
			if(value2 < 2) {
				System.out.println("1");
			}
			else {
				System.out.println("2");
			}
		}
		else {
			System.out.println("3");
		}
		System.out.println();
		
		//switch-for
		int value3 = 2;
		switch(value3) {
		case 1 :
			for(int k=0; k<10; k++) {
				System.out.print(k+" ");
			}
			break;
		case 2 :
			for(int k=10; k>0; k--) {
				System.out.print(k+" ");
			}
			break;
		}
		System.out.println();
		
		//for-for-if
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(i+" "+j);
				if(i==j) {
					System.out.println("i = j");
				}
			}
		}
	}
}
