package sec06_objectclass.EX02_ObjectMethod_equals;

public class StringField {
	
	public static void main(String[] args) {
		String str = new String("What is Field name");
		String compare1 = "What is Field name";
		String compare2 = "What is Field name";
		
		System.out.println(str.equals(compare1));
		System.out.println(str==compare1);
		System.out.println(compare1==compare2);
		System.out.println(compare1.hashCode()==compare2.hashCode());
	}
}
