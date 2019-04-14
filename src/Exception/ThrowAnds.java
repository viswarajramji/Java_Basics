package Exception;

class MyException extends Exception {
	public MyException() {

	}

	public MyException(String str) {
		super(str);
	}
}

public class ThrowAnds {
	static void test() throws MyException {
		System.out.println("Exception Occured");
		throw new MyException("My Own Exception");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (MyException ex) {
			System.out.println(ex.toString());
		}

	}
}
