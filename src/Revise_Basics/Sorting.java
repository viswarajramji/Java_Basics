package Revise_Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		int a[]= {5,4,3,1,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("bad");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(Arrays.toString(list.toArray()));
		
		
	}
}
