package course40;

public class Practice03 {

	public static void main(String[] args) {
		
		int[] numbers = {11, 20, 31, 40, 51};
		
		for (int x = 0; x < 5; x++) {
			if (numbers[x] % 2 == 1) {
				System.out.println(numbers[x]);
			}
		}
		
		printHello();
		multiply(10 , 40);
		tutorial();
		int x = multiplymodori(10 , 30);
		System.out.println(x);
		boolean tf = isEven(4);
		System.out.println(tf);
		String moji = getGreeting("わたべ");
		System.out.println(moji);
		
	}
	
	static void tutorial() {
		System.out.println("ちゅーとりある");
	}
	
	static void printHello() {
		System.out.println("Hello, World");
	}
	
	static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	static int multiplymodori(int a, int b) {
		int sum = a * b;
		return sum;
	}
	
	static boolean isEven(int number) {
		boolean x;
		if (number % 2 == 0) {
			x = true;
		} else {
			x = false;
		}
		return x;
	}
	
	static String getGreeting(String name) {
		String aaa = "こんにちは" + name;
		return aaa;
	}
	

}
