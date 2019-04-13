package basic;

public class NullPointerExec {

	private static void  test1(Integer val) {
		System.out.println("Integer value");
	}

	private static void test1(String val) {
		System.out.println("string");
	}

	public static void main(String[] args) {
		Integer t1=null;
		String s1=null;
		test1(s1);
	}
}
