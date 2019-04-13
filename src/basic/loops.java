package basic;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		// for loop
		System.out.println("Enter the limit");
		int input = scan.nextInt();
		for (i = 0; i <= input; i++) {
			System.out.println(i);
		}
		
		i = 0;
		// do while loop
		do {
			i++;
			System.out.println(i);

		} while (i <= input);
		
		i = 0;
		// while loop
		while (i <= input) {
			System.out.println(i);
			i++;
		}

	}
}
