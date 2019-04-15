package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class SortById implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.id - arg1.id;
	}

}

public class Sort {
	
	private static void print_values(List<Student> list) {
		for(Student stu:list) {
			System.out.println(stu.id);
			System.out.println(stu.name);
		}
	}
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(2, "Shan");
		Student s2 = new Student(1, "Mich");
		Student s3 = new Student(3, "Shan");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Before Sorting");
		print_values(list);
		Collections.sort(list, new SortById());
		System.out.println("After  Sorting");
		print_values(list);
		
	}
}
