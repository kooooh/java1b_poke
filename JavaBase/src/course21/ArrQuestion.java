package course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int tuki = 0;
		int tyhoonSum = 0;
		int quakeSum = 0;
		int rainSum = 0;
		int[] getu = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] tyhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		int hozu = 0;
		int hozugetu = 0;
		int g = 0;
		int f = 0;
		for (int a = 0; a < 12; a++) {
			tyhoonSum = tyhoonSum + tyhoon[a];
			quakeSum = quakeSum + quake[a];
			rainSum = rainSum + rain[a];
		}
		while (f != 1) {
			System.out.println("見たい情報を選択してください。");
			System.out.println("1:台風件数 2:地震件数 3:降水量 4:全て");
			int flg1 = stdIn.nextInt();
			int flg2;
			int flg3;
			if (flg1 == 1) {
				System.out.println("年別か月別化を選択してください。");
				System.out.println("1:年別 2:月別 3:月別(大きい順に表示)");
				flg2 = stdIn.nextInt();
				if (flg2 == 1) {
					System.out.println("1年間に起こった台風の総合計は" + tyhoonSum + "件です。");
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				} else if (flg2 == 2) {
					System.out.println("見たい月を入力してください。");
					flg3 = stdIn.nextInt();
					if (flg3 == 9999) {
						System.out.println("システム権限をあなたに付与します。");
						System.out.println("データの変更したい月を選択してください。");
						g = stdIn.nextInt();
						System.out.println("データを入力してください");
						tyhoon[g - 1] = stdIn.nextInt();
						System.out.println("終了しますか？");
						System.out.println("1:はい 2:いいえ");
						f = stdIn.nextInt();

					} else {
						tuki = flg3 - 1;
						System.out.println(flg3 + "月の台風件数は" + tyhoon[tuki] + "件です。");
						System.out.println("終了しますか？");
						System.out.println("1:はい 2:いいえ");
						f = stdIn.nextInt();
					}
				} else if (flg2 == 3) {
					for (int m = 11; m >= 0; m--) {
						for (int n = 0; n < m; n++) {
							if (tyhoon[n] < tyhoon[n + 1]) {
								hozu = tyhoon[n + 1];
								hozugetu = getu[n + 1];
								tyhoon[n + 1] = tyhoon[n];
								getu[n + 1] = getu[n];
								tyhoon[n] = hozu;
								getu[n] = hozugetu;
							}
						}
					}
					for (int r = 0; r < 12; r++) {
						if (getu[r] / 10 >= 1) {
							System.out.println(getu[r] + "月の台風件数は" + tyhoon[r] + "件です。");
						} else {
							System.out.println(" " + getu[r] + "月の台風件数は" + tyhoon[r] + "件です。");
						}
					}
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				} else {
					System.out.println("ちゃんと数値入力しろ");
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				}
			} else if (flg1 == 2) {
				System.out.println("年別か月別化を選択してください。");
				System.out.println("1:年別 2:月別 3:月別(大きい順に表示)");
				flg2 = stdIn.nextInt();
				if (flg2 == 1) {
					System.out.println("1年間に起こった地震の総合計は" + quakeSum + "件です。");
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				} else if (flg2 == 2) {
					System.out.println("見たい月を入力してください。");
					flg3 = stdIn.nextInt();
					if (flg3 == 9999) {
						System.out.println("システム権限をあなたに付与します。");
						System.out.println("データの変更したい月を選択してください。");
						g = stdIn.nextInt();
						System.out.println("データを入力してください");
						quake[g - 1] = stdIn.nextInt();
						System.out.println("終了しますか？");
						System.out.println("1:はい 2:いいえ");
						f = stdIn.nextInt();
					} else {

						tuki = flg3 - 1;
						System.out.println(flg3 + "月の地震件数は" + quake[tuki] + "件です。");
						System.out.println("終了しますか？");
						System.out.println("1:はい 2:いいえ");
						f = stdIn.nextInt();
					}
				} else if (flg2 == 3) {
					for (int m = 11; m >= 0; m--) {
						for (int n = 0; n < m; n++) {
							if (quake[n] < quake[n + 1]) {
								hozu = quake[n + 1];
								hozugetu = getu[n + 1];
								quake[n + 1] = quake[n];
								getu[n + 1] = getu[n];
								quake[n] = hozu;
								getu[n] = hozugetu;
							}
						}
					}
					for (int r = 0; r < 12; r++) {
						if (getu[r] / 10 >= 1) {
							System.out.println(getu[r] + "月の地震件数は" + quake[r] + "件です。");
						} else {
							System.out.println(" " + getu[r] + "月の地震件数は" + quake[r] + "件です。");
						}
					}
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				} else {
					System.out.println("ちゃんと数値入力しろ");
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				}
			} else if (flg1 == 3) {
				System.out.println("年別か月別化を選択してください。");
				System.out.println("1:年別 2:月別 3:月別(大きい順に表示)");
				flg2 = stdIn.nextInt();
				if (flg2 == 1) {
					System.out.println("1年間に起こった降水量の総合計は" + rainSum + "件です。");
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				} else if (flg2 == 2) {
					System.out.println("見たい月を入力してください。");
					flg3 = stdIn.nextInt();
					if (flg3 == 9999) {
						System.out.println("システム権限をあなたに付与します。");
						System.out.println("データの変更したい月を選択してください。");
						g = stdIn.nextInt();
						System.out.println("データを入力してください");
						rain[g - 1] = stdIn.nextInt();
						System.out.println("終了しますか？");
						System.out.println("1:はい 2:いいえ");
						f = stdIn.nextInt();
					} else {

						tuki = flg3 - 1;
						System.out.println(flg3 + "月の降水量は" + rain[tuki] + "件です。");
						System.out.println("終了しますか？");
						System.out.println("1:はい 2:いいえ");
						f = stdIn.nextInt();
					}
				} else if (flg2 == 3) {
					for (int m = 11; m >= 0; m--) {
						for (int n = 0; n < m; n++) {
							if (rain[n] < rain[n + 1]) {
								hozu = rain[n + 1];
								hozugetu = getu[n + 1];
								rain[n + 1] = rain[n];
								getu[n + 1] = getu[n];
								rain[n] = hozu;
								getu[n] = hozugetu;
							}
						}
					}
					for (int r = 0; r < 12; r++) {
						if (getu[r] / 10 >= 1) {
							System.out.println(getu[r] + "月の降水量件数は" + rain[r] + "件です。");
						} else {
							System.out.println(" " + getu[r] + "月の降水量件数は" + rain[r] + "件です。");
						}
					}
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				} else {
					System.out.println("ちゃんと数値入力しろ");
					System.out.println("終了しますか？");
					System.out.println("1:はい 2:いいえ");
					f = stdIn.nextInt();
				}
			} else if (flg1 == 4) {
				for (int x = 0; x < 12; x++) {
					tuki++;
					System.out.println(tuki + "月の台風件数は" + tyhoon[x] + "件です。");
				}
				System.out.println("1年間に起こった台風の総合計は" + tyhoonSum + "件です。");
				tuki = 0;
				for (int y = 0; y < 12; y++) {
					tuki++;
					System.out.println(tuki + "月の地震件数は" + quake[y] + "件です。");
				}
				System.out.println("1年間に起こった地震の総合計は" + quakeSum + "件です。");
				tuki = 0;
				for (int z = 0; z < 12; z++) {
					tuki++;
					System.out.println(tuki + "月の降水量件数は" + rain[z] + "件です。");
				}
				System.out.println("1年間に起こった降水量の総合計は" + rainSum + "件です。");
				System.out.println("終了しますか？");
				System.out.println("1:はい 2:いいえ");
				f = stdIn.nextInt();
			} else {
				System.out.println("ちゃんと数値入力しろ");
				System.out.println("終了しますか？");
				System.out.println("1:はい 2:いいえ");
				f = stdIn.nextInt();
			}
		}
		System.out.println("お疲れさまでした。");
	}

}
