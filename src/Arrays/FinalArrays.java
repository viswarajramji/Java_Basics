package Arrays;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int arr[]= {1,2,3,4,5};
		arr[arr.length-1]=4;
		System.out.println(Arrays.toString(arr));
	}
}
