package sec03_threadproperties.EX04_ThreadProperties_3_2;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬 쓰레드":"일반 쓰레드"));
		
		for(int i =0; i<6; i++) {
			System.out.println(getName() + " : " + i +"초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_2 {
	public static void main(String[] args) {
		
		//데몬 쓰레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		//3.5초 후 main 쓰레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
	}
}
