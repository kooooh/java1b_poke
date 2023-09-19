package course10;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日を入力してください");
		System.out.println("午前、午後、夜間からお選びください");
		String x = stdIn.next();
		String y = stdIn.next();
		
		String z = x + y;
		switch(z) {
		case "日曜午前","日曜午後","日曜夜間","火曜午前","水曜夜間","金曜午前","土曜午後","土曜夜間":
			System.out.println("予約できません"); break;
		default:
			System.out.println("予約できます");
		}
		
	}

}
