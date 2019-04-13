package basic;

public class seraching {
	public static void main(String[] args) {
		int val[] = { 1, 2, 3, 4, 5 };
		boolean flag=false;
		int x = 15;
		for (int i = 0; i < val.length; i++) {
			if(x==val[i]) {
				System.out.println("elment found");
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Elment not found");
		}
	}
}
