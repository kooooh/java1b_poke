package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		//問題1
		String MyGroup [] = new String[3];
		MyGroup [0] = "いとうこうせい";
		MyGroup [1] = "いのるうき";
		MyGroup [0] = "すずきれいや";
		
		//問題2
		int MyGroupNum [] = new int[3];
		MyGroupNum [0] = 1;
		MyGroupNum [1] = 3;
		MyGroupNum [2] = 15;
		
		//問題3
		int [] MyNum = new int[3];
		MyNum [0] = 10;
		MyNum [1] = 50;
		MyNum [2] = MyNum [0] + MyNum[1];
		
		//問題4
		System.out.println("数値を入力してください");
		int MyNumScan [] = new int [3];
		MyNumScan[0] = 10;
		MyNumScan[1] = stdIn.nextInt();
		MyNumScan[2] = MyNumScan[0] + MyNumScan[1];
		
		
	}

}
