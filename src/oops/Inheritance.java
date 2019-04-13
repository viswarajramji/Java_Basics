package oops;

class Base{
	void test() {
		System.out.println("Base Class");
	}
}
public class Inheritance extends Base {
	void child() {
		System.out.println("child");
	}
	public static void main(String[] args) {
		Inheritance i1=new  Inheritance();
		i1.test();
		i1.child();
	}

}
