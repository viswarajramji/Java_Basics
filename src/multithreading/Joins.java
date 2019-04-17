package multithreading;

class App implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}

public class Joins {
	public static void main(String[] args) {
		Thread t1=new Thread(new App());
		Thread t2=new Thread(new App());
		Thread t3=new Thread(new App());
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		

	}
}
