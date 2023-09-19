package course12;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数字を二回入力してください");
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int a = 1;
		int b = 1;

		while (a <= x) {
			while (b <= y) {
				System.out.print(a * b + ",");
				b++;
			}
			b = 1;
			a++;
			System.out.println("");
		}

	}

}
