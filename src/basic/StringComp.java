package basic;

//new String will create a new reference
//direct assing will get the ref from string pool
public class StringComp {
public static void main(String[] args) {
	String t1="hello";
	String t2="hello";
	String s1=new String("hello");
	String s2=new String("hello");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(t1==t2);
}
}
