package sec02_exceptionhandlingsyntax.EX04_TryWithResouse_2;

class A implements AutoCloseable {
	String resouce;
	A(String resouce){
		this.resouce = resouce;
	}
	
	@Override
	public void close() throws Exception {
		if(resouce!=null) {
			resouce = null;
			System.out.println("Resouces returned");
		}
	}
}

public class TryWithResouse_2 {
	public static void main(String[] args) {
		A a1 = null;
		try {
			a1 = new A("Files");
		}
		catch (Exception e) {
			System.out.println("Exception handling");
		}
		finally {
			if(a1.resouce != null) {
				try {
					a1.close();
				}
				catch (Exception e) {}
			}
		}
		
		try (A a2 = new A("Files");) {
			System.out.println("Auto return resouces");
		}
		catch (Exception e) {
			System.out.println("Exception handling");
		}
		
	}
}
