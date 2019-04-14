package Exception;

public class NullPointerExec {
	public static void main(String[] args) {
		try {
			String val = null;
			val.length();

		} catch (NullPointerException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		} catch (Exception ex) {

		}
	}
}
