package basic;

public class Decision {
  public static void main(String[] args) {
	int age=14;
	switch(age) {
	case 18: 
		System.out.println("eligible to vote");
		break;
	default:
		System.out.println("Not eligible");
	}
}
}
