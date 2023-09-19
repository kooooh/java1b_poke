package course10;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日を入力してください");
		System.out.println("午前、午後、夜間からお選びください");

		String x = stdIn.next();
		String y = stdIn.next();

		if (x.equals("日曜")) {
			System.out.println("予約できません。");
		} else if (x.equals("火曜") && y.equals("午前")) {
			System.out.println("予約できません。");
		} else if (x.equals("金曜") && y.equals("午前")) {
			System.out.println("予約できません。");
		} else if (x.equals("水曜") && y.equals("夜間")) {
			System.out.println("予約できません。");
		} else if (x.equals("土曜") && !(y.equals("午前"))) {
			System.out.println("予約できません。");
		} else {
			System.out.println("予約できます。");
		}

	}

}
