package sec01_fileandcharset.EX06_ByteArrayToFromString;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToFromString {
	public static void main(String[] args) throws UnsupportedEncodingException{
		// 1. String getBytes() : String -> byte[]
		byte[] array1 = "사과".getBytes();
		byte[] array2 = "포도".getBytes(Charset.defaultCharset());
		byte[] array3 = "자두".getBytes(Charset.forName("MS949"));
		byte[] array4 = "망고".getBytes("UTF-8");
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		// 2. new String() : byte[] -> String
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));
		String str4 = new String(array4, "UTF-8");
		String str5 = new String(array3, "UTF-8");
		String str6 = new String(array4, "MS949");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println();
		// 3. 인코딩 체크
		String test = "감자";
		byte[] testArray = test.getBytes(Charset.forName("MS949"));
		String[] charSet = {"utf-8", "euc-kr", "ksc5601", "iso-8859-1", "x-windows-949"};
		for(int i = 0; i<charSet.length; i++){
			System.out.println("[" + charSet[i] + "]" + new String(testArray, Charset.forName(charSet[i])));
		}
	}
}
