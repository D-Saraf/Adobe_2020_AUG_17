import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThirdExample {

	public static void main(String[] args) {
		first();
//		try {
//			second();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			second();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
	}

	private static void second() throws ClassNotFoundException, FileNotFoundException {
		Class.forName("com.adobe.sample.SomeClass");
		FileInputStream fin = new FileInputStream("a.txt");
	}

	// Not recommended
//	private static void second() throws Exception {
//		Class.forName("com.adobe.sample.SomeClass");
//		FileInputStream fin = new FileInputStream("a.txt");
//	}

	private static void first() {
		int x = 10;
		int y = 0;
		if (y != 0) {
			int result = x / y;
			System.out.println("Result " + result);
		}

	}

}
