package course34;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
	
	Scanner stdIn = new Scanner(System.in);
	
	int x = stdIn.nextInt();
	
	int[] variable = new int [x];
	
	offOff();
	int z = calc(100, 50);
	System.out.println(z);
	String moji = prapra("練習問題");
	System.out.println(moji);
	
	}
	
	static void offOff() {
		
		System.out.println("呼び出されました");
		
	}
	
	static int calc(int x , int y) {
		return x + y;
	}
	
	static String prapra(String aaa){
		String bbb = aaa + "を受け取りました";
		return bbb;
	}
	
	
}
