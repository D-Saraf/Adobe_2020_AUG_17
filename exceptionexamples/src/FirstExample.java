
public class FirstExample {
	
	static {
		System.loadLibrary("pubg.dll");
	}
	
	public static void main(String[] args) {
		System.out.println("Start!!!");
		doTask();
	}

	private static void doTask() {
		System.out.println("I am in doTask!!!");
//		doTask(); StackOverflowError
	}

}
