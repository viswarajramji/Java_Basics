package multithreading;

class AppRunnable implements Runnable {
	int i;

	public AppRunnable(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i + "runnable interface");
	}

}

public class RunnableInterface {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new AppRunnable(i));
			thread.start();
		}
	}
}
