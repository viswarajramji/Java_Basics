package basic;

public class NullPointer {
	public static void main(String[] args) {
		NullPointer pointer=null;
		pointer.test1();
	}
	
	public static void  test1() {
		System.out.println("static method called");
	}
	
	public void test2() {
		System.out.println("non static method called");
	}
}

