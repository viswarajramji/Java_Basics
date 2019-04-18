package multithreading;

class Utils {
	static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Shared {
	synchronized void test1(Shared s2) {
		Utils.sleep();
		System.out.println("thread 1");
		s2.test2(this);
	}

	synchronized void test2(Shared s1) {
		System.out.println("thread 2");
		Utils.sleep();
		s1.test1(this);
	}
}

class Thread1 extends Thread {
	Shared s1, s2;

	Thread1(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		s1.test1(s2);
	}
}

class Thread2 extends Thread {
	Shared s1, s2;

	Thread2(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		s2.test2(s1);
	}
}

public class DeadLock {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Thread1 t1 = new Thread1(s1, s2);
		Thread2 t2 = new Thread2(s1, s2);
		t1.start();
		t2.start();
	}
}
