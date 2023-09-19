package course41;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);
		
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);
		
		System.out.println("文字列を入力してください。");
		String mojiretu = stdIn.next();
		System.out.println(mojiretu);
		
		for (int n = 1; n >= 5; n++) {
			System.out.println(n + "回目のループです");
		}
		
		System.out.println("数値を入力してください。");
		int suu = stdIn.nextInt();
		if (suu >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}
		
		boolean isRaning = true;
		if (isRaning) {
			System.out.println("傘をもってけー");
		} else {
			System.out.println("良い１日を！");
		}
		
		int[] numArr = {10 , 50 , 30 , 20 , 40};
		
		for (int m = 0; m < numArr.length; m++) {
			System.out.println(numArr[m]);
		}
		
		int hozu = 0;
		for (int n = 0; n < numArr.length; n++) {
			for (int m = numArr.length - 1; m > n; m--) {
				if (numArr[n] > numArr[m]) {
					hozu = numArr[m];
					numArr[m] = numArr[n];
					numArr[n] = hozu;
				}
			}
		}
		System.out.println(numArr[4]);
		
	}

}
