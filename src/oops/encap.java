package oops;

class Testing{
	 private String name;
	 public void set_name(String name) {
		 this.name=name;
	 }
	 
	 public String get_name() {
		 return name;
	 }
			  
}
public class encap {
 public static void main(String[] args) {
	Testing test=new Testing();
	test.set_name("hello");
	System.out.println(test.get_name());
}
}


