package Exception;

class MyException extends Exception {
	public MyException() {

	}

	public MyException(String str) {
		super(str);
	}
}

public class CustomException {
	public static void main(String[] args) {
		try {
			throw new MyException("this is crazy exception");
		} catch (MyException ex) {
			System.out.println(ex.toString());
		}
	}
}
