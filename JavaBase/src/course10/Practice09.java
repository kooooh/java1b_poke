package course10;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日を入力してください");
		
		String x = stdIn.next();
		
		switch(x) {
		case "日曜","火曜","金曜":
			System.out.println("予約できません"); break;
		default:
			System.out.println("予約できます");
		}
		
		
	}

}
