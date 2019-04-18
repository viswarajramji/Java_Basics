package multithreading;

public class RunTimeHook {
	public static void main(String[] args) {
		Runtime runTime = Runtime.getRuntime();
		runTime.addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutting down the hook");
			}
		});

		System.out.println("CTRL+C to stop the hook");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
