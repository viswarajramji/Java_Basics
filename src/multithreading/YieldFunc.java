package multithreading;

class YieldEx implements Runnable {
	public YieldEx() {

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println("values for i" + i);
			}
		} catch (InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}

}

public class YieldFunc {
	public static void main(String[] args) {
		Thread thread = new Thread(new YieldEx());
		thread.start();
		Thread.yield();
		System.out.println("complete task");

	}
}
