package game;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Trainer trainer = new Trainer();
		Pocketon[] Pocke = new Pocketon[6];
		System.out.println("あなたの名前は？？");
		trainer.name = stdIn.next();
		Battle battt = new Battle();
		Pocketon po = new Pocketon(null, null, 0, 0);
		int cnt = 0;
		int sentaku;
		int cc = 0;

		do {
			System.out.println("1；捕獲　2；図鑑　3；バトル　99；終了");
			sentaku = stdIn.nextInt();

			if (sentaku == 1) {
				
				cc = 0;
				for (int n = 0; n < 6; n++) {
					if (trainer.myPockes[n] != null) {
						cc++;
					}
				}
				if (cc == 6) {
					System.out.println("手持ちがいっぱいです！！");
					System.out.println("もう一度やり直してください。");
				} else {
				
					System.out.println("捕獲したいポンケモンの名前を入力してください。");
					po.name = stdIn.next();
					System.out.println("捕獲したいポンケモンのタイプ（火、水、地面、草）を入力してください。");
					po.type = stdIn.next();
					System.out.println("捕獲したいポンケモンの戦闘力を入力してください。");
					po.power = stdIn.nextInt();
					System.out.println("捕獲したいポンケモンの捕獲難易度を入力してください。");
					po.difficult = stdIn.nextInt();
	
					Pocke[cnt] = po;
	
					trainer.capture(Pocke[cnt]);
					trainer.display();
					cnt++;
				}
				
			} else if (sentaku == 2) {
				trainer.display();
			} else if (sentaku == 3) {
				System.out.println("戦わせたいポンケモンを2匹選んでください。");
				trainer.display();
				String x = stdIn.next();
				String y = stdIn.next();

				int xx = 0;
				int yy = 0;

				for (int i = 0; i < trainer.myPockes.length; i++) {
					if (trainer.myPockes[i] != null) {
						if (x.equals(trainer.myPockes[i].name)) {
							xx = i;
						} else if (y.equals(trainer.myPockes[i].name)) {
							yy = i;
						}
					}
				}

				String winner = battt.doBattle(trainer.myPockes[xx], trainer.myPockes[yy]);
				System.out.println("勝ったのは" + winner + "です。");
			}

		} while (sentaku != 99);
		
		System.out.println("おーわり");
	}
}
