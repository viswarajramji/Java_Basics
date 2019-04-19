package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Stu{
	int id;
	String name;
	
	Stu(int id, String name){
		this.id=id;
		this.name=name;
	}
}
public class LinkedListEg {
	public static void main(String[] args) {
		List<Stu> list=new LinkedList<>();
		Stu s1=new Stu(1,"hello");
		Stu s2=new Stu(2,"hello");
		Stu s3=new Stu(3,"hello");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		ListIterator<Stu> iter=list.listIterator(list.size());
		while(iter.hasPrevious()) {
			Stu s=iter.previous();
			System.out.println(s.id);
			System.out.println(s.name);
			
		}
	}
}
