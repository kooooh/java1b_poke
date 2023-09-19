package course09;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("肉、魚、野菜、クスリどれが好き？");
		String like = stdIn.next();

		switch (like) {
		case "野菜":
		case "クスリ":
			System.out.println("健康的ですね");
			break;

		case "肉":
			System.out.println("肉派ですね");
			break;

		default:
			System.out.println("魚はですね");

		}
		
	}

}
