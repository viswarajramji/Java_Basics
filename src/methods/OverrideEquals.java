package methods;

class Application1 {
	int id;
	String name;

	public Application1(int id, String str) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Application1)) {
			return false;
		}
		Application1 app = (Application1) obj;
		return app.id == this.id;
	}
}

public class OverrideEquals {
	public static void main(String[] args) {
		Application1 app1 = new Application1(1, "hello1");
		Application1 app2 = new Application1(1, "hello2");
		Application1 app3 = new Application1(2, "hello3");
		System.out.println(app1.equals(app2));
		System.out.println(app2.equals(app3));

	}
}
