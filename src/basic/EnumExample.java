package basic;

enum Day {
	MONDAY, SUNDAY;
}

public class EnumExample {

	public static void main(String args[]) {

		Day days[] = Day.values();
		for (Day day : days) {
			System.out.println(day);
		}
	}
}
