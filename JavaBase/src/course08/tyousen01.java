package course08;

import java.util.Scanner;

public class tyousen01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("月を入力してください　Ex　1月→１");
		int x = stdIn.nextInt();
		
		switch(x) {
		case 1,3,5,7,8,10,12 :
			System.out.println(31+"日"); break;
		case 4,6,9,11:
			System.out.println(30+"日"); break;
		default:
			System.out.println(28+"日"); 
		}
		
	}

}
