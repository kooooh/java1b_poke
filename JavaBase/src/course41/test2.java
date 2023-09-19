package course41;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();
		int[] variable = new int[x];

		int hozu;
		int[] numExArr = { 10, 50, 30, 20, 40 };
		for (int n = 0; n < 4; n++) {
			hozu = numExArr[n];
			numExArr[n] = numExArr[n + 1];
			numExArr[n + 1] = hozu;
		}

		for (int n = 0; n < 5; n++) {
			System.out.println(numExArr[n]);
		}

	}

}
