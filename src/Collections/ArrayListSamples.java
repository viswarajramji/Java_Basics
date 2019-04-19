package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSamples {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
