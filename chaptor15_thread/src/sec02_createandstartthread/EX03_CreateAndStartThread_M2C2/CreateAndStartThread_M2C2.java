package sec02_createandstartthread.EX03_CreateAndStartThread_M2C2;

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

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};

		for(int i  : intArray) {
			System.out.print("(video frame) " + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C2 {
	public static void main(String[] args) {
		Runnable smiRun = new SMIFileRunnable();
		Thread smiThread = new Thread(smiRun);
		smiThread.start();
		Runnable videoRun = new VideoFileRunnable();
		Thread videoThread = new Thread(videoRun);
		videoThread.start();
	}
}
