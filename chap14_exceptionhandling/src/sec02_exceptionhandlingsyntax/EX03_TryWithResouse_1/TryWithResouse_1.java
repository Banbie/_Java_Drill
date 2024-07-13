package sec02_exceptionhandlingsyntax.EX03_TryWithResouse_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouse_1 {
	public static void main(String[] args) {
		System.out.println("Input String");
		
		try (InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input =(char)isr1.read();
			System.out.println("Input = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		InputStreamReader isr2 = null;
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("Input = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(isr2!=null) {
				try {
					isr2.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
