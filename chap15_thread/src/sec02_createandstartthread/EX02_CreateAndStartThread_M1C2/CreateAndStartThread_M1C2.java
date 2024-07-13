package sec02_createandstartthread.EX02_CreateAndStartThread_M1C2;

class SMIFileThread extends Thread {
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

class VideoFileThread extends Thread {
	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};

		for(int i  : intArray) {
			System.out.print("(video frame) " + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M1C2 {
	public static void main(String[] args) {
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
	}
}
