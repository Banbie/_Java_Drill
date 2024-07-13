package sec05_threadstates.EX01_NewRunnableTerminated;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		// 쓰레드 상태 저장 클래스
		Thread.State state;
		
		//NEW
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i< 1000000000L; i++) {}
			}
		};
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//Runnable
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//Terminated
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}
}
