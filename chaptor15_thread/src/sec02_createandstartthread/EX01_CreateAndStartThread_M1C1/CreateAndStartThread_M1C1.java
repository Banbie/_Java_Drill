package sec02_createandstartthread.EX01_CreateAndStartThread_M1C1;

class SMIFileThread extends Thread {
	@Override
	public void run() {
		String[] strArray = {"one","two","three","four","five"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		
		for(String smi : strArray) {
			System.out.println(" - (caption number) " + smi);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		for(int i : intArray) {
			System.out.println("(video frame) " + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
