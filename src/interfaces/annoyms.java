package interfaces;

interface Appl {
	void get_name();
}

public class annoyms {
	public static void main(String[] args) {
		Appl app = new Appl() {

			@Override
			public void get_name() {
				System.out.println("hello world application");

			}

		};
		
		app.get_name();
	}
}
