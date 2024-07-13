package sec05_threadstates.EX04_TimedWaiting_Join;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i =0; i < 1000; i++) {
			System.out.println(1000-i+"myThread1");
		} // 시간지연
	}
}

class MyThread2 extends Thread {
	MyThread1 myThread1;
	
	public MyThread2(MyThread1 myThread) { // 매개변수로 MyThread1의 객체를 생성자로 전달 파라미터를 대입
		this.myThread1 = myThread;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) 진행중 interrupt() 발생");
			for(int i =0; i < 1000; i++) {
				System.out.println(i+"myThread2");
			} // 시간지연
		}
	}
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		// 객체 생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		myThread1.start();
		myThread2.start();
		//try {Thread.sleep(100);} catch (InterruptedException e) {}; // start 준비시간
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		// TIME_WAITING
		myThread2.interrupt();
		try {Thread.sleep(25);} catch (InterruptedException e) {}; // interrupt 준비시간 하드웨어에 따라 다름
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		try {Thread.sleep(3000);} catch (InterruptedException e) {}; // main thread 유지
	}
}
