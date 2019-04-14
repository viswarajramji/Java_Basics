package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("path");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bufReader = new BufferedReader(reader);
	}
}
