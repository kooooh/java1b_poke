package course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Typhoon typhoon1 = new Typhoon(1, "2022/4/8", "マラカス");
		Typhoon typhoon2 = new Typhoon(2, "2022/4/10", "メーギー");
		Typhoon typhoon3 = new Typhoon(3, "2022/6/30", "チャバ");
		Typhoon typhoon4 = new Typhoon(4, "2022/7/1", "アイレー");
		Typhoon typhoon5 = new Typhoon(5, "2022/7/28", "ソングダー");
		Typhoon typhoon6 = new Typhoon(6, "2022/7/31", "トローセス");
		Typhoon typhoon7 = new Typhoon(7, "2022/7/9", "ムーラン");
		Typhoon typhoon8 = new Typhoon(8, "2022/8/12", "メアリー");
		Typhoon typhoon9 = new Typhoon(9, "2022/8/22", "マーゴン");
		Typhoon typhoon10 = new Typhoon(0, "", "");
		Typhoon typhoon11 = new Typhoon(0, "", "");
		Typhoon typhoon12 = new Typhoon(0, "", "");
		Typhoon typhoon13 = new Typhoon(0, "", "");
		Typhoon typhoon14 = new Typhoon(0, "", "");
		Typhoon typhoon15 = new Typhoon(0, "", "");

		Typhoon[] typhoonList = { typhoon1, typhoon2, typhoon3, typhoon4, typhoon5, typhoon6, typhoon7, typhoon8,
				typhoon9, typhoon10, typhoon11, typhoon12, typhoon13, typhoon14, typhoon15 };

		int cnt = 9;
		String henkoumei;
		int f = 0;

		do {
			System.out.println("編集しますか？");
			System.out.println("台風名変更：99　台風追加：55　終了：0");
			int nyuryoku = stdIn.nextInt();
			if (nyuryoku == 0) {
				for (int n = 0; n < 9; n++) {
					System.out.println(typhoonList[n].getAsiaName());
				}
			} else if (nyuryoku == 99) {
				System.out.println("編集モードに入ります。");
				System.out.println("変えたい台風名の番号を入力してください。");

				int bangonyu = stdIn.nextInt();
				System.out.println("台風名を入力してください。");
				henkoumei = stdIn.next();
				typhoonList[bangonyu - 1].setAsiaName(henkoumei);
				System.out.println("変更後の結果は以下のとおりです。");

				for (int n = 0; n < 9; n++) {
					System.out.println(typhoonList[n].getAsiaName());
				}
			} else if (nyuryoku == 55) {
				if (cnt < 15) {
					System.out.println("追加モードに入ります。");
					System.out.println("台風番号を入力してください。");
					
					int nyubango = stdIn.nextInt();
					typhoonList[cnt].setTyphoonbango(nyubango);
					System.out.println("台風の発生日を入力してください。");
					String nyuhiniti = stdIn.next();
					typhoonList[cnt].setHasseibi(nyuhiniti);
					System.out.println("台風名を入力してください。");
					henkoumei = stdIn.next();
					typhoonList[cnt].setAsiaName(henkoumei);
					cnt++;
					for (int n = 0; n < cnt; n++) {
						System.out.print(typhoonList[n].getTyphoonbango() + ".");
						System.out.print(typhoonList[n].getHasseibi() + "　");
						System.out.println(typhoonList[n].getAsiaName());
					}
				} else {
					System.out.println("これ以上追加できません。");
				}
			} else {
				System.out.println("ちゃんと入力してください。");
			}
			System.out.println("終わりにしますか？");
			System.out.println("１：続ける　　２：終了");
			f = stdIn.nextInt();
		} while (f != 2);
		System.out.println("プログラムを終了します。");

	}

}
