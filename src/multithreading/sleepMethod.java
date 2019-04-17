package multithreading;

class SleepingMethod implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ex) {
			System.out.println("Thread Interrupted");
		}
	}
}

public class sleepMethod {
	public static void main(String[] args) {
		Thread t1 = new Thread(new SleepingMethod());
		t1.start();
	}
}
