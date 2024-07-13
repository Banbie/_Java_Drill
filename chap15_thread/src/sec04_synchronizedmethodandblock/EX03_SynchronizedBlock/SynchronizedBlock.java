package sec04_synchronizedmethodandblock.EX03_SynchronizedBlock;

class MyData {
	int data = 3;
	public void plusData() {
		synchronized (this) {
			int mydata = data;
			try {Thread.sleep(2000);} catch (InterruptedException e) {}
			data = mydata +1;
		}
	}
}

class PlusThread extends Thread {
	MyData myData; 
	public PlusThread(MyData myData) { //생성자로 참조
		this.myData = myData;
	}
	
	@Override
	public void run() { //console 작동부
		myData.plusData();
		System.out.println(getName() + " 실행 결과 : " + myData.data);
	}
}

public class SynchronizedBlock {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
