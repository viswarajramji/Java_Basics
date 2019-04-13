package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		Collections.sort(list);
		System.out.println("Order-"+Arrays.toString(list.toArray()));
		//reverse order 
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse Order="+Arrays.toString(list.toArray()));
		
	}
}
