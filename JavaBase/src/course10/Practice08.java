package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を三回入力してください。");

		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();

		if (x > y) {
			if (x > z) {
				if (y > z) {
					System.out.println(x + "が1番大きい数値です" + y + "が2番目に大きい数値です" + z + "が3番目に大きい数値です");
				} else {
					System.out.println(x + "が1番大きい数値です" + z + "が2番目に大きい数値です" + y + "が3番目に大きい数値です");
				}

			} else {
				System.out.println(z + "が1番大きい数値です" + x + "が2番目に大きい数値です" + y + "が3番目に大きい数値です");
			}
		} else {
			if (x > z) {
				System.out.println(y + "が1番大きい数値です" + z + "が2番目に大きい数値です" + z + "が3番目に大きい数値です");
			} else if (y > z) {
				System.out.println(y + "が1番大きい数値です" + z + "が2番目に大きい数値です" + x + "が3番目に大きい数値です");
			} else {
				System.out.println(z + "が1番大きい数値です" + y + "が2番目に大きい数値です" + x + "が3番目に大きい数値です");
			}
		}
	}

}
