package course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xの値を入力");
		int x = stdIn.nextInt();
		System.out.println("yの値を入力");
		int y = stdIn.nextInt();
		
		if (x > y) {
			System.out.println("xがでかい！");	
		} else if (x < y) {
			System.out.println("yがでかい！");
		} else {
			System.out.println("おなじー");
		}
		
		
	}

}
