package sec05_readerwriter.EX06_OutputStreamWriter_2;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		// 1. 콘솔 출력 UTF-8
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n 한글과 영문이 모두 포함돼 있습니다. \n");
			osw.write("Good bye!!!\n");
			osw.flush();
		} catch(IOException e) {}
		System.out.println();
		// 2. 콘솔 출력 UTF-8 -> MS949
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n 한글과 영문이 모두 포함돼 있습니다. \n");
			osw.write("Good bye!!!\n");
			osw.flush();
		} catch(IOException e) {}
		System.out.println();
	}
}
