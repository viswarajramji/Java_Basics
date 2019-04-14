package Constructor;

public class ChainingContructor {
	public ChainingContructor() {
		this(10);
	}

	public ChainingContructor(int a) {
		this(10, 15);
		System.out.println(a);
		

	}

	public ChainingContructor(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		ChainingContructor cons=new ChainingContructor();
	}
}
