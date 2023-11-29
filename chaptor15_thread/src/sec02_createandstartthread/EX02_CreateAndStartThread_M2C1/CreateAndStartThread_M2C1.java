package sec02_createandstartthread.EX02_CreateAndStartThread_M2C1;

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		String[] strArray = {"one", "two", "three", "four", "five"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		
		for(String str : strArray) {
			System.out.println(" - (caption number) " + str);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C1 {
	public static void main(String[] args) {
		Runnable smiFileRunnable = new SMIFileRunnable();
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		
		int[] intArray = {1, 2, 3, 4, 5};

		for(int i  : intArray) {
			System.out.print("(video frame) " + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
