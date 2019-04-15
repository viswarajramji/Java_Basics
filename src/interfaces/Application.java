package interfaces;

interface App {
	void getName();
}

class VRGame implements App {

	@Override
	public void getName() {
		System.out.println("VR Game");
	}

}

class XBOX implements App {

	@Override
	public void getName() {
		System.out.println("XBOX Gam");

	}

}

public class Application {

	public static void main(String[] args) {
		App app=new VRGame();
		app.getName();
		app=new XBOX();
		app.getName();
	}
}
