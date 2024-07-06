package sec03_consoleinputoutput.EX02_ConsoleInputObject_2;
import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_2 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		// 1. 1-byte 단위 읽기
		int data;
		while((data = is.read()) != '\r')
			System.out.print((char)data);
		is.read(); // \n (10)
		System.out.println();
		System.out.println();
		// 2. n-byte 단위 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		for(int i = 0; i < count1; i++)
			System.out.print((char)byteArray1[i]);
		System.out.println(": count = " + count1);
		System.out.println();
		// 3. n-byte 단위 읽기(아에서 length만큼 읽어 byte[] offset 위치에 넣기)
		byte[] byteArray2 = new byte[8]; //offset + length
		int offset = 3;
		int length = 5;
		int count2 = is.read(byteArray2, offset, length);
		for(int i = 0; i < offset+count2; i++)
			System.out.print((char)byteArray2[i]);
		System.out.println(": count = " + count2);
	}
}
