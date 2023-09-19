package course24;

import java.util.Scanner;

public class dentaku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int cnt = 0;
		int z = 0;
		int suuti = 0;

		do {
			System.out.println("1:足し算 2:引き算 3:掛け算 4:割り算");
			int f = stdIn.nextInt();

			if (cnt == 0) {
				System.out.println("数値を入力してください。");
				suuti = stdIn.nextInt();
			}
			cnt = cnt + 1;
			System.out.println("数値を入力してください。");
			z = stdIn.nextInt();
			if (suuti == 9999 || z == 9999) {
				break;
			}

			if (f == 1) {
				suuti = plus(suuti, z);
			} else if (f == 2) {
				suuti = minus(suuti, z);
			} else if (f == 3) {
				suuti = kake(suuti, z);
			} else {
				suuti = waru(suuti, z);
			}
			System.out.println(suuti);
		} while (cnt <= 100);

	}

	static int plus(int hozu, int kazu) {
		hozu = hozu + kazu;
		return hozu;
	}

	static int minus(int hozu, int kazu) {
		hozu = hozu - kazu;
		return hozu;
	}

	static int kake(int hozu, int kazu) {
		hozu = hozu * kazu;
		return hozu;
	}

	static int waru(int hozu, int kazu) {
		hozu = hozu / kazu;
		return hozu;
	}

}
