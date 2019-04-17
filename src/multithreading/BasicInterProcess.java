package multithreading;

import java.util.Scanner;

class Process {
	public void Producer() {
		synchronized (this) {
			System.out.println("Produced Successfully");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void Consumer() {
		synchronized (this) {
			System.out.println("Enter a values to be consumed");
			Scanner scan = new Scanner(System.in);
			scan.nextLine();
			System.out.println("consumed");
			notify();

		}
	}
}

public class BasicInterProcess {
	public static void main(String[] args) {
		Process p = new Process();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				p.Producer();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				p.Consumer();
			}
		});

		try {
			t1.start();
			Thread.sleep(1000);
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("applation ended");

	}
}
