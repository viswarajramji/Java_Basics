package basic;

class Test {
	int a;

	Test(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.a);
	}
}

public class FinalVariables {
	public static void main(String args[]) {
		final int a = 10;
		final Test test = new Test(14);
		System.out.println(a);
		test.a = 16;
		System.out.println(test.toString());
	}
}
