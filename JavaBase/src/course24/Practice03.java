package course24;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int cnt = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int[] suuti = new int[100];
		System.out.println("1:足し算 2:引き算 3:掛け算 4:割り算");
		int f = stdIn.nextInt();

		for (int n = 0; n <= 100; n++) {
			System.out.println("数値を入力してください。");
			z = stdIn.nextInt();
			cnt = cnt + 1;
			if (z != 9999) {
				suuti[n] = z;
			} else {
				break;
			}

		}
		if (f == 1) {
			x = suuti[0];
			for (int m = 1; m < cnt - 1; m++) {
				y = suuti[m];
				x = plus(x, y);
			}
			System.out.println(x);
		} else if (f == 2) {
			x = suuti[0];
			for (int m = 1; m < cnt - 1; m++) {
				y = suuti[m];
				x = minus(x, y);
			}
			System.out.println(x);
		} else if (f == 3) {
			x = suuti[0];
			for (int m = 1; m < cnt - 1; m++) {
				y = suuti[m];
				x = kake(x, y);
			}
			System.out.println(x);
		} else {
			x = suuti[0];
			for (int m = 1; m < cnt - 1; m++) {
				y = suuti[m];
				x = waru(x, y);
			}
			System.out.println(x);
		}

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
