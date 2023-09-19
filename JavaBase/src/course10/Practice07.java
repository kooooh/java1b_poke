package course10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください");
		
		int x = stdIn.nextInt();
		int y = x % 2;
		if (y == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}

}
