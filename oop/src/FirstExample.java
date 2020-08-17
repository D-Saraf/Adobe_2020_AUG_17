
public class FirstExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		add(x,y);
		System.out.println("Bye!!!");
	}

	private static void add(int a, int b) { // a and b are call by value [ Copy ]
		int result = 0;
		result = a + b;   
		System.out.println("Result " + result);
	}

}
