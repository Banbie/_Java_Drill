package sec04_synchronizedmethodandblock.EX02_SynchronizedMethod;

//공유 개체
class MyData {
	int data = 3;
	public synchronized void plusData() { //data 작동부
		int mydata = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = mydata+1;
	}
}

class PlusThread extends Thread {
	MyData myData; 
	public PlusThread(MyData myData) { //생성자로 참조
		this.myData = myData;
	}
	
	public void run() { //console 작동부
		myData.plusData();
		System.out.println(getName() + " 실행 결과 : " + myData.data);
	}
}

public class SynchronizedMethod {
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
