package methods;

public class NullOverride {
	private void test(Object o) {
		System.out.println("object");
	}

	private void test(Integer i) {
		System.out.println("Integer");
	}

	private void test(String s) {
		System.out.println("string");
	}

	public static void main(String[] args) {
		Object o1=null;
		NullOverride nullOver=new NullOverride();
		nullOver.test(o1);
	}
}
