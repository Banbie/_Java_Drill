package sec05_readerwriter.EX05_OutputStreamWriter_1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {
		// 1. FileWriter를 이용해 데이터 쓰기
		File outputStreamWriter1 = new File("src/sec05_readerwriter/files/OutputStreamWriter1.txt");
		try(Writer writer = new FileWriter(outputStreamWriter1);) {
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 모두 포함돼 있습니다.");
			writer.write('\n');
			writer.write("Good bye!!\n\n");
			writer.flush();
		} catch(IOException e) {System.out.println("fail");}
		// 1. FileWriter를 이용해 데이터 쓰기 UTF-8 -> MS949
		File outputStreamWriter2 = new File("src/sec05_readerwriter/files/OutputStreamWriter2.txt");
		try(OutputStream os = new FileOutputStream(outputStreamWriter2, false);
				OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");) {
			osw.write("OutputStreamWriter2 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함돼 있습니다.");
			osw.write('\n');
			osw.write("Good bye!!\n\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch(IOException e) {System.out.println("fail");}
	}
}
