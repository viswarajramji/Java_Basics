package oops;

class BaseClass {
	BaseClass() {

	}

	void test() {
		System.out.println("testing user");
	}
}

class Child extends BaseClass {
	public Child() {

	}

	void test() {
		System.out.println("testing child");
	}
}

public class RunTimePoly {
	public static void main(String[] args) {
	   BaseClass cls=new Child();
	}
}
