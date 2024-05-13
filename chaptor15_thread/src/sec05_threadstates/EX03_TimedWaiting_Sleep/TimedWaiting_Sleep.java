package sec05_threadstates.EX03_TimedWaiting_Sleep;

class MyThread extends Thread {
	@Override
	public void run() {
		try { //try catch 필요
			Thread.sleep(3000);
		} catch(InterruptedException e) { // interruptedException 반드시 필요 객체.interrupt() call에 들어가는 블록
			System.out.println(" -- sleep() 진행 중 interrupt() 발생");
			for(long i = 0; i < 1000000000L; i++) {} // 시간 지연
		}
	}
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {} // 쓰레드 시작 준비 시간
		System.out.println("MyThread State = " + myThread.getState()); 
		//Time_Waiting
		myThread.interrupt(); //myThread 객체 쓰레드 TIME_WAITING -> RUNNABLE 전환
		try {Thread.sleep(100);} catch (InterruptedException e) {} // 인터럽트 준비 시간
		System.out.println("MyThread State = " + myThread.getState()); 
		
	}
}
