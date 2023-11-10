package sec01_selelctcontrolstatement.EX02_SwitchControlStatement;

public class SwitchControlStatement {
	public static void main(String[] args) {
		// no break
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default :
			System.out.println("D");
		}
		System.out.println();
		
		//break
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();
		
		//if else
		if(value1 ==1 ) {
			System.out.println("A");
		}
		else if(value1 == 2) {
			System.out.println("B");
		}
		else if(value1 == 3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
}
