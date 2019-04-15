package multithreading;

class AppThread extends Thread {
	int i;

	public AppThread(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	public void run() {
		System.out.println("Application Running Thread" + this.i);
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			AppThread thread = new AppThread(i);
			thread.start();
		}

	}
}
