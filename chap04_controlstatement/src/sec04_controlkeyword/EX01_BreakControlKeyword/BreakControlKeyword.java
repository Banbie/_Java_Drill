package sec04_controlkeyword.EX01_BreakControlKeyword;

public class BreakControlKeyword {

	public static void main(String[] args) {
		//single loop escape
		for(int i =0; i<10; i++) { //dead code
			System.out.println(i);
			break;
		}
		
		for(int i =0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		
		//multi loop escape
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(j ==2) {
					break;
				}
				System.out.println(i+","+j);
			}
		}
		System.out.println();
		
		//break + label
		POS1: for(int i=0; i<5;i++) {
			for(int j =0; j<5; j++) {
				if(j==2) {
					break POS1;
				}
				System.out.println(i+","+j+" POS1");
			}
		}
		System.out.println();
		
		//break + flag
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(j ==2 ) {
					i=100;
					break;
				}
				System.out.println(i+","+j+" flag");
			}
		}
		System.out.println();
	}

}
