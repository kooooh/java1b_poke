package course09;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("誕生月を入力してね。例：3月なら「3」と入力。");
		int month = stdIn.nextInt();

		switch (month) {
		case 1, 2, 3:
			System.out.println("大吉");
			break;

		case 4, 5, 6:
			System.out.println("中吉");
			break;

		case 7, 8, 9:
			System.out.println("小吉");
			break;

		default:
			System.err.println("大凶");

		}

	}

}
