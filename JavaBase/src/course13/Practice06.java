package course13;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してね");

		int x = stdIn.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println(i);
			int su = i % 2;
			if (i != 0) {
				if (su == 0) {
					System.out.println("偶数だよ");
				} else {
					System.out.println("奇数だよ");
				}

				if (i >= 100) {
					System.out.println("どんだけ回すの");
				}
			}
		}

	}

}
