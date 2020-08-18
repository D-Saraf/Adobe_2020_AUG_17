
public class SecondExample {

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
			System.out.println("Sorry :-( ");
		});
		System.out.println("Start!!!");
		doTask();
		System.out.println("Bye!!!");
	}

	private static void doTask() {
		int x = 10;
		int y = 0;
		int result = x / y;
		System.out.println("Result " + result);
	}

}
