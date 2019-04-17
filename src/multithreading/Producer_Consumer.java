package multithreading;

import java.util.ArrayList;
import java.util.List;

class PC {
	static ArrayList<Integer> list = new ArrayList<>();
	int max_size = 5;
	int value = 0;

	void producer() throws InterruptedException {
		synchronized (this) {
			while (true) {
				if (list.size() == max_size) {
					wait();
				}
				list.add(++value);
				notify();

			}
		}
	}

	void consume() throws InterruptedException {
		synchronized (this) {
			while (true) {
				if (list.size() == 0) {
					wait();
				}
				int val = list.remove(0);
				System.out.println(val);
				notify();
			}
		}
	}
}

public class Producer_Consumer {
	public static void main(String[] args) {
		final PC pc=new PC();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
	}
}
