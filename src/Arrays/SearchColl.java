package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchColl {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		int index=Collections.binarySearch(list, 2);
		System.out.println(index+1);
	}
}
