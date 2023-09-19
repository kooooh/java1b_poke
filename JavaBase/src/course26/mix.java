package course26;

import java.util.Random;
import java.util.Scanner;
public class mix {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	static int end(int modori) {
		Scanner stdIn = new Scanner(System.in);
		int endFlg = stdIn.nextInt();
		if (endFlg == 9999) {
			System.out.println("終了");
			modori = 0;
		} else {
			System.out.println("継続");
			modori = 1;
		}
		return modori;

	}
	
	static int ransu() {
		Random random=new Random();
		int randomNumber=random.nextInt(12);
		return randomNumber;
	}
	
	static void  syojikin (int kane) {
		System.out.println(kane);
		
	}
	
	static int hilow (int x , int y) {
		Scanner stdIn = new Scanner(System.in);
		int hantei = stdIn.nextInt();
		int kekka ;
		if (hantei == 1 && x > y) {
			kekka = 0;
		} else if (hantei == 2 && x < y) {
			kekka = 0;
		} else {
			kekka = 1;
		}
		return kekka;
		
	}
	
	static String winlose (int xx) {
		int xx = hilow();
		String xxx;
		if (xx == 0) {
			xxx = "WIN";
		} else {
			xxx = "LOSE";
		}
		return xxx;
	}

}
