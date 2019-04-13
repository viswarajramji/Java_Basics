package basic;

class Car {
	String car;

	Car(String car) {
		this.car = car;
	}
}

class Wrapper {
	Car c;

	Wrapper(Car c) {
		this.c = c;
	}

}

public class SwapObject {

	static void Swap(Wrapper W1, Wrapper W2) {
		Car temp = W1.c;
		W1.c = W2.c;
		W2.c = temp;
	}

	public static void main(String[] args) {
		Car bmw = new Car("BMW");
		Car audi = new Car("Audi");
		Wrapper W1 = new Wrapper(bmw);
		Wrapper W2 = new Wrapper(audi);
		System.out.println(W1.c.car);
		System.out.println(W2.c.car);
		Swap(W1, W2);
		System.out.println(W1.c.car);
		System.out.println(W2.c.car);

	}
}
