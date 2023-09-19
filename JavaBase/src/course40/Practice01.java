package course40;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int number = 15;
		int age = 20;
		int score = 85;
		boolean isRaning = true;
		int sum = 0;
		
		
		if (number > 10) {
			System.out.println("でか！！！");
		}
		
		if (age >= 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだね ^ ^");
		}
		
		if (score >= 90) {
			System.out.println("Excellent");
		} else if (score >= 80 && score < 90) {
			System.out.println("Good");
		} else {
			System.out.println("勉強しましょう。");
		}
		
		if (isRaning) {
			System.out.println("傘持ってけーーー");
		} else {
			System.out.println("よい１日を！");
		}
		
		System.out.println("数値を入力してください。");
		int num = stdIn.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}
		
		for (int n = 1; n <= 10; n++) {
			System.out.println(n);
		}
		
		for (int m = 1; m <= 100; m++) {
			if (m % 2 == 0) {
				System.out.println("現在" + m + "回目のループです。偶数です。");
			} else {
				System.out.println(m);
			}
		}
		
		for (int x = 10; x > 0; x--) {
			System.out.println(x);
		}
		
		for (int y = 1; y <= 100; y++) {
			sum = sum + y;
		}
		System.out.println(sum);
	}

}
