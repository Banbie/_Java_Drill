package sec02_createandstartthread.EX05_CreateAndStartThread_M2C3;

public class CreateAndStartThread_M2C3 {
	public static void main(String[] args) {
		Thread captionThread = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = {"one", "two", "three", "four", "five"};
				try {Thread.sleep(10);} catch (InterruptedException e) {}
				
				for(String str : strArray) {
					System.out.println(" - (caption number) " + str);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread frameThread = new Thread(new Runnable() {
			@Override
			public void run() {
				int[] intArray = {1, 2, 3, 4, 5};

				for(int i  : intArray) {
					System.out.print("(video frame) " + i);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		captionThread.start();
		frameThread.start();
	}
}
