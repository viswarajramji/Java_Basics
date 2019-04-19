package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapsEx {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "hello");
	map.put(2,"hell1");
	for(Integer key:map.keySet()) {
	  String val=map.get(key);
	  System.out.println(val);
	}
}
}
