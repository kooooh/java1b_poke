package course46_47;

public class Practice01 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int number = 0;
		if (number != 0) {
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			} else {
				System.out.println("0で割るな！！！");
			}
		}

		int number2 = 0;
		if (number2 != 0) {
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			} else {
				System.out.println("0で割るな！！！");
			}
		}
		int a = 10;
		int b = 0;
		int result = divideNumbers(a, b);
		if (result < a) {
			System.out.println(result);
		} else {
			System.out.println("0で割るな！！！");
		}

	}

	public static int divideNumbers(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			return a++;
		}
	}

}
