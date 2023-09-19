package course19;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int[] numArray = new int[3];

		for (int x = 0; x < 3; x++) {
			numArray[x] = 10 + x;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(numArray[i]);
		}

		System.out.println("数値を入力してください");

		int[] numArray2 = new int[stdIn.nextInt()];

		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int hozu = 0;

		for (int zz = 4; zz > 0; zz--) {
			if (logicArray[0] > logicArray[zz]) {
				hozu = logicArray[zz];
				logicArray[zz] = logicArray[0];
				logicArray[0] = hozu;
			}
		}

		for (int v = 0; v < 5; v++) {
			System.out.println(logicArray[v]);
		}

	}

}
