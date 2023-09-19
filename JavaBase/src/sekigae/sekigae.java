package sekigae;

import java.util.Random;
import java.util.Scanner;

public class sekigae {
	//席の数のカウント変数
	static int cnt = 1;
	//仮データを格納する変数
	static int[][] xxx = new int[6][6];

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//席の座標
		int[][] x = new int[6][7];
		//席の変更を継続するかの判別の変数
		int flg = 0;
		//席替えがランダムか指定かの判別の変数
		int kimekata = 0;
		//席を変更するかどうかの判別の変数
		int henkou = 0;
		//フラグ
		int f1 = 0;
		int f2 = 0;
		int nyf = 0;

		//xに初期値を代入
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				x[a][b] = 0;
			}
		}

		//現在の席座標を表示
		System.out.println("席の座標は下記の通りです。");
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				System.out.print("(" + (a + 1) + " , " + (b + 1) + ")");
				//6列目まで行ったか
				if (b % 5 == 0 && b != 0) {
					System.out.println("");
				}
			}
		}

		//想定外の数値が入力された場合
		//数値の再入力をしてもらうループ
		do {
			System.out.println("席の決め方は？");
			System.out.println("１：ランダム　２；指定");
			kimekata = stdIn.nextInt();
			//席替えがランダムか指定かの判別
			if (kimekata == 1) {
				do {
					//座標保存の変数（仮）
					int hozu = Rand();
					//行を格納する変数
					int hozu1 = hozu / 10;
					//列を格納する変数
					int hozu2 = hozu - hozu1 * 10;
					x[hozu1][hozu2] = cnt;
				} while (cnt <= 36);
			} else if (kimekata == 2) {
				//座席を配列xに格納し終わるまで
				for (int aa = 0; aa < 6; aa++) {
					for (int bb = 0; bb < 6; bb++) {
						//フラグが立つまで
						do {
							System.out.println("好きな番号を入力してください");
							//入力値を代入するための変数
							int ny = stdIn.nextInt();
							nyf = 0;
							//入力値が規定値いないか	
							if (ny > 36 || ny <= 0) {
								nyf++;
							}
							//フラグが立っていないか（入力値が規定値いないか）
							if (nyf == 0) {
								//配列xをループして確認
								for (int a = 0; a < 6; a++) {
									for (int b = 0; b < 6; b++) {
										//入力値が一度も使われていないか
										if (x[a][b] == ny) {
											nyf++;
										}
									}
								}
							}
							//入力値が配列xにない場合配列xに代入
							if (nyf == 0) {
								x[aa][bb] = ny;
							} else {
								System.out.println("入力しなおしてください。");
							}
							System.out.println("現在の座席は下記のとおりです。");
							for (int a = 0; a < 6; a++) {
								for (int b = 0; b < 6; b++) {
									if (x[a][b] / 10 != 0) {
										System.out.print(x[a][b] + " ");
									} else {
										System.out.print(" " + x[a][b] + " ");
									}
									if (b % 5 == 0 && b != 0) {
										System.out.println("");
									}
								}
							}
							System.out.println("");
						} while (nyf != 0);
					}
				}
			} else {
				System.out.println("入力しなおしてください。");
			}
		} while (kimekata != 1 && kimekata != 2);

		//席替え後の席を表示
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				//出席番号が何桁か
				if (x[a][b] / 10 != 0) {
					System.out.print(x[a][b] + " ");
				} else {
					System.out.print(" " + x[a][b] + " ");
				}
				if (b % 5 == 0 && b != 0) {
					System.out.println("");
				}
			}
		}

		//想定外の数値が入力された場合
		//数値の再入力をしてもらうループ
		do {
			System.out.println("席替えを行いこのような座席になりました。");
			System.out.println("席を変更しますか？");
			System.out.println("はい；１　いいえ：２");
			henkou = stdIn.nextInt();

			//席を変更するかどうか
			if (henkou == 1) {
				//ユーザが終了させるまでループ
				do {
					System.out.println("どこの座席を変更しますか。座標を入力してください。");
					System.out.println("例：(3 , 4) →　34");
					//入れ替えしたい席を格納する変数
					int mae = stdIn.nextInt();

					//フラグが立つまで
					do {
						//入力された数値が想定外か
						if ((mae > 66 || mae < 11) || mae % 10 >= 7 || mae % 10 == 0) {
							System.out.println("入力しなおしてください。");
							System.out.println("どこの座席を変更しますか。座標を入力してください。");
							System.out.println("例：(3 , 4) →　34");
							mae = stdIn.nextInt();
						}

						//入力された数値が想定内か
						if (mae <= 66 && mae >= 11 && mae % 10 <= 6) {
							f1 = 1;
						}
					} while (f1 == 0);

					System.out.println("どこと入れ替えますか。座標を入力してください。");
					System.out.println("例：(1 , 1) →　11");
					//入れ替え先の席を格納する変数
					int ato = stdIn.nextInt();

					do {
						if ((ato > 66 || ato < 11) || ato % 10 >= 7 || ato % 10 == 0) {
							System.out.println("入力しなおしてください。");
							System.out.println("どこの座席を変更しますか。座標を入力してください。");
							System.out.println("例：(1 , 1) →　11");
							ato = stdIn.nextInt();
						}

						if (ato <= 66 && ato >= 11 && ato % 10 <= 6) {
							f2 = 1;
						}
					} while (f2 == 0);

					//入れ替えしたい席の行を格納する変数
					int mae1 = mae / 10 - 1;
					//入れ替えしたい席の列を格納する変数
					int mae2 = mae - (mae1 + 1) * 10 - 1;
					//入れ替え先の席の行を格納する変数
					int ato1 = ato / 10 - 1;
					//入れ替え先の席の行を格納する変数
					int ato2 = ato - (ato1 + 1) * 10 - 1;

					//入れ替え処理
					x[5][6] = x[mae1][mae2];
					x[mae1][mae2] = x[ato1][ato2];
					x[ato1][ato2] = x[5][6];

					System.out.println("変更後の席は下記のとおりです。");
					//変更後の席を表示
					for (int a = 0; a < 6; a++) {
						for (int b = 0; b < 6; b++) {
							//出席番号が何桁か
							if (x[a][b] / 10 != 0) {
								System.out.print(x[a][b] + " ");
							} else {
								System.out.print(" " + x[a][b] + " ");
							}
							if (b % 5 == 0 && b != 0) {
								System.out.println("");
							}
						}
					}

					//想定外の数値が入力された場合
					//数値の再入力をしてもらうループ
					do {
						System.out.println("変更を続けますか？");
						System.out.println("はい；１　いいえ：２");
						flg = stdIn.nextInt();

						//想定外の数値が入力されたか
						if (flg != 1 && flg != 2) {
							System.out.println("入力しなおしてください。");
						}
					} while (flg != 1 && flg != 2);

				} while (flg != 2);

			} else if (henkou != 2) {
				System.out.println("入力しなおしてください。");
			}
		} while (henkou != 1 && henkou != 2);

		System.out.println("確定後の席は以下のとおりです。");
		//確定後の席を表示
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				if (x[a][b] / 10 != 0) {
					System.out.print(x[a][b] + " ");
				} else {
					System.out.print(" " + x[a][b] + " ");
				}
				if (b % 5 == 0 && b != 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("席替えプログラムを終了します。");
	}

	static int Rand() {
		Random rnd = new Random();
		//ランダムで発生した数を格納する変数
		int a;
		int b;
		//フラグ
		int flg = 0;
		//フラグが立つまでループ
		do {
			a = rnd.nextInt(6) + 1;
			b = rnd.nextInt(6) + 1;
			//ランダムで指定した配列にすでにデータが格納されているか
			if (xxx[a - 1][b - 1] == 0) {
				xxx[a - 1][b - 1] = cnt;
				cnt++;
				flg = 1;
			}
		} while (flg != 1);
		//行を格納する変数
		int n = a - 1;
		//列を格納する変数
		int m = b - 1;

		return n * 10 + m;
	}

}
