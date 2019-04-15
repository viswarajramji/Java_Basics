package methods;

public class overrid {
	static void test1() {
		System.out.println("test1");
	}
	
	static void test2(String s) {
		System.out.println("test2");
	}
	public static void main(String[] args) {
		overrid rid=new overrid();
		rid.test1();
		rid.test2(null);;
	}
}
