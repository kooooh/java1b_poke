package course00;

import java.util.Random;
import java.util.Scanner;

public class tyousen02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("何連しますか？");
		int gatya = stdIn.nextInt();
		
		int hozu = gatya;
		while(hozu > 0) {
			
			
			
			int juren = gatya / 10;
			int tanpatu = gatya % 10;
			
			if(gatya > 300) {
				while()
			} else if (gatya == 300) {
				
			} else {
				while(hozu > 0) {
					int x = rnd.nextInt(gatya) + 1;
					
					int ssr = hozu * 3 / 100;
					int ssrp = ssr * 7 / 10;
					hozu = hozu - ssr;
					ssr = ssr - ssrp;
					int sr = hozu * 15 / 100;
					hozu = hozu - sr;
					int r = hozu;
				}
			}
			
			
			
		}
		
		
		
		
	}

}
