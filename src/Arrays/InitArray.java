package Arrays;

import java.util.Arrays;

public class InitArray {
	public static void main(String[] args) {
		int[] arr = new int[3];
		//other initailize
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
	}
}
