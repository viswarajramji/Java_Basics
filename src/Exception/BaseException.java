package Exception;

public class BaseException {
	public static void main(String[] args) {
		try {
			int a[]= {1,2,3};
			a[a.length]=5;
			//Inverted will not work 
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
