package sec03_threadproperties.EX01_ThreadProperties_1;

public class ThreadProperties_1 {
	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println("Thread name = " + curThread.getName());
		System.out.println("Thread count = " + Thread.activeCount());
		
		int threadCount = 3;
		for(int i = 0; i<threadCount; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i = 0; i<threadCount; i++) {
			Thread thread = new Thread();
			thread.setName(i + " thread");
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i = 0; i<threadCount; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("current thread count = " + Thread.activeCount());
	}
}
