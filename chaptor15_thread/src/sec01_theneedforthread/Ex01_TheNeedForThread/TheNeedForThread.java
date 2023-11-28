package sec01_theneedforthread.Ex01_TheNeedForThread;

public class TheNeedForThread {
	//singleThread
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"one", "two","three", "four", "five"};
		
		for(int i : intArray) {
			System.out.println("video frame : " + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
		
		for(String str : strArray) {
			System.out.println("caption  : " + str);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
