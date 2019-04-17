package multithreading;

import java.util.ArrayList;
import java.util.List;

class Operation {
	static List<Integer> values = new ArrayList<>();
	static int size = 5;
	int counter = 0;

	synchronized void producer() {
		while (true) {
			if (values.size() == 5) {
				System.out.println("limit reached");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			}
			values.add(counter);
			System.out.println(counter);
			counter++;
			notifyAll();
		}

	}

	synchronized void consume() {
		while (true) {
			if (values.size() == 0) {
				try {
					wait();
				} catch (InterruptedException ex) {
					System.out.println("");
				}
				return;
			}
			System.out.println(values.remove(values.size() - 1));
			notifyAll();
		}
	}
}

class ProduceThread implements Runnable {
	Operation o;

	public ProduceThread(Operation o) {
		this.o = o;
	}

	public void run() {
		o.producer();
	}

}

class ConsumerThread implements Runnable {
	Operation o;

	public ConsumerThread(Operation o) {
		this.o = o;
	}

	public void run() {
		o.consume();
	}
}

public class InterProcessCom {
	public static void main(String[] args) {
		Operation o = new Operation();
		Thread t1 = new Thread(new ProduceThread(o));
		Thread t2 = new Thread(new ConsumerThread(o));
	
		try {
			Thread.sleep(2000);
			t1.start();
			t2.start();
	        t1.join(); 
	        t2.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
