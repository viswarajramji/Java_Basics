package interfaces;

@FunctionalInterface
interface Func {
	void run();
}

public class functionalInterface {
	public static void main(String[] args) {
		Func fun = new Func() {

			@Override
			public void run() {
				System.out.println("hello");

			}
		};

		fun.run();
	}
}
