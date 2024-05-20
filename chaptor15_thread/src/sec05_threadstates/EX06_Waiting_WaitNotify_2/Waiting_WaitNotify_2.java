package sec05_threadstates.EX06_Waiting_WaitNotify_2;

class DataBox {
	boolean isEmpty = true;
	int data;
	synchronized void inputData(int data) {
		if(!isEmpty) { // WAITING
			try {wait();} catch(InterruptedException e) { e.printStackTrace(); }
		}
		this.data = data;
		isEmpty = false;
		System.out.println("input data = " + data);
		notify();
	}
	synchronized void outputData() {
		if(isEmpty) { // WAITING
			try {wait();} catch(InterruptedException e) { e.printStackTrace(); }
		}
		isEmpty = true;
		System.out.println("output data = " + data);
		notify();
	}
}

public class Waiting_WaitNotify_2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 8; i ++) {
					dataBox.inputData(i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 8; i ++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
