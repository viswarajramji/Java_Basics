package Exception;

public class Finaly {
	public static void main(String[] args) {
		try {
			String test=null;
			test.length();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		} finally {
			System.out.println("closing all the resources");
		}
	}
}
