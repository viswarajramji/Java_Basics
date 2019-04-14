package Singleton;

class MyInstance {
	private static MyInstance instance = null;
	private int X = 10;

	private MyInstance() {

	}

	public int getX() {
		return X;
	}

	public static MyInstance getInstance() {
		if (instance == null) {
			instance = new MyInstance();
		}
		return instance;
	}
}

public class Singleton {
	public static void main(String[] args) {
		MyInstance instance = MyInstance.getInstance();
		System.out.println(instance.getX());

	}
}
