package sec03_consoleinputoutput.EX05_ConsoleOutputObject_2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConsoleOutputObject_2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		// n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		// n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터를 쓰기)
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset());
		os.write(byteArray2, 6, 6);
		os.flush();
	}
}
