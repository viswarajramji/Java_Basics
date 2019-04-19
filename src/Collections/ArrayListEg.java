package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListEg {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		System.out.println(Arrays.toString(array.toArray()));

		// using Iterator
		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//using Iterator to remove 
		iter = array.iterator();
		while(iter.hasNext()) {
			System.out.println("removing elements "+iter.next());
			iter.remove();
		}
	}
}
