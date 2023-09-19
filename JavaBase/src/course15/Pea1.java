package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		//xは所持金
		int x = 10000;
		int cnt = 0;
		while (x > 0) {
			System.out.println("現在の所持金は" + x + "円です。");
			System.out.println("いくら賭けますか？");
			
			//さいころ1を表示
			int kakekin = stdIn.nextInt();
			int num1 = rnd.nextInt(7) + 1;
			System.out.println(num1 + " ");
			
			//掛け金変更
			System.out.println("2つ目のサイコロを振る前なら掛け金変更可能です。");
			System.out.println("変更しますか？　1：変える　2：変えない");
			int f1 = stdIn.nextInt();
			if(f1 == 1) {
				System.out.println("掛け金を入力してください。");
				kakekin = stdIn.nextInt();
			} 
			//さいころ2を表示
			int num2 = rnd.nextInt(7) + 1;
			System.out.println(num1 + " " + num2 + " ");
			
			System.out.println("現在の出目は、一投目：" + num1 + "、二投目：" + num2 + "です。");
			System.out.println("三投目を投げる前に辞退可能です。");
			System.out.println("辞退しますか？　1：辞退する　2：辞退しない");
			int f2 = stdIn.nextInt();
			if(f2 == 1) {
				cnt = 1;
				break;
			}
			
			//さいころ3と改行を表示
			int num3 = rnd.nextInt(7) + 1;
			System.out.println(num1 + " " + num2 + " " + num3 + " ");



			//チンチロのシステム
			//ピンゾロ
			if (num1 == 1 && num2 == 1 && num3 == 1) {
				x = x - kakekin;
				kakekin = kakekin * 5;
				x = x + kakekin;
				//ゾロ目
			} else if (num1 == num2 && num2 == num3) {
				x = x - kakekin;
				kakekin = kakekin * 3;
				x = x + kakekin;
				//通常の目
			} else if (num1 == num2 || num2 == num3 || num1 == num3) {
				//ションベン
				if ((num1 == 7 && num2 == 7) || (num2 == 7 && num3 == 7) || (num1 == 7 && num3 == 7)) {
					x = x - kakekin;
				}
				x = x - kakekin;
				x = x + kakekin;

				//シゴロ	
			} else if (num1 > 3 && num2 > 3 && num3 > 3) {
				if (num1 < 7 && num2 < 7 && num3 < 7) {
					if (num1 != num2 && num2 != num3 && num1 != num3) {
						x = x - kakekin;
						kakekin = kakekin * 2;
						x = x + kakekin;
					}
				} else {
					x = x - kakekin;
				}

				//一二三
			} else if (num1 < 4 && num2 < 4 && num3 < 4) {
				if (num1 != num2 && num2 != num3 && num1 != num3) {
					x = x - kakekin;
					kakekin = kakekin * 2;
					x = x - kakekin;
				}
				//役なし
			} else {
				x = x - kakekin;
			}
			if (x >= 50000) {
				System.out.println("おめでとう！");
				break;
			}
		}
		if(cnt != 1) {
			System.out.println("1050年地下労働行き！");
		} else {
			System.out.println("現在の所持金は" + x + "円です。");
		}
	}
}