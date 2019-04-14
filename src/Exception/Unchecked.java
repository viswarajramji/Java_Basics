package Exception;

public class Unchecked {
	public static void main(String[] args) {
		try {
			String inp = null;
			inp.length();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exceptions ");
		}

	}
}
