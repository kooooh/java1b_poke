package course29;

import java.util.Random;

public class Character {
	Random rnd = new Random();
	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP:" + hp);
		System.out.println("攻撃力:" + str);
		System.out.println("防御力:" + def);
		System.out.println("命中率:" + dex);
		System.out.println("回避率:" + agi);
	}

	void battle(Character player1, Character player2) {
		System.out.println(player2.name + "があらわれた！！");
		int cnt = 0;
		//hpが続く限り戦いを続けるための処理
		while (player1.hp > 0 && player2.hp > 0 || cnt == 20) {

			//player1とplayer2のagiを比較して、高い方が先制攻撃！
			//攻撃は「攻撃者のstr - 被攻撃者のdef」の結果を相手を被攻撃者のHPから引く
			//先制攻撃終了後、agiの低い方が攻撃を行う。
			if (player1.agi < player2.agi) {
				if (player2.str - player1.def <= 0) {
					int r = rnd.nextInt(2) + 1;
					if (r == 1) {
						System.out.println(player2.name + "は" + player1.name + "にダメージを与えられなかった！！");
						player1.agi = player1.agi + 10;
					} else {
						System.out.println(player2.name + "は" + player1.name + "に" + 1 + "のダメージを与えた！！");
						player1.agi = player1.agi + 10;
					}
				} else {
					player1.hp = player1.hp - (player2.str - player1.def);
					System.out.println(	player2.name + "は" + player1.name + "を焼却炉に放り込んだ！！");
					System.out.println(player1.name + "は"  + (player2.str - player1.def) + "のダメージを受けた！！");
					player1.agi = player1.agi + 10;
				}
			} else {
				if (player1.str - player2.def <= 0) {
					int r = rnd.nextInt(2) + 1;
					if (r == 1) {
						System.out.println(player1.name + "は" + player2.name + "にダメージを与えられなかった！！");
						player1.agi = player1.agi + 10;
					} else {
						System.out.println(player1.name + "は" + player2.name + "に" + 10 + "のダメージを与えた！！");
						player1.agi = player1.agi + 10;
					}
				} else {
					player2.hp = player2.hp - (player1.str - player2.def);
					System.out.println(
							player1.name + "は" + player2.name + "に" + (player1.str - player2.def) + "のダメージを与えた！！");
					player2.agi = player2.agi + 10;
				}
			}
			System.out.println(player1.name + "のHPは" + player1.hp);
			System.out.println(player2.name + "のHPは" + player2.hp);
			cnt++;
		}
		if (player1.hp < 0) {
			System.out.println(player1.name + "は死亡した。だが、皆の記憶の中で生き続ける。");
		} else {
			System.out.println(player1.name + "は勝利した。");
			System.out.println("そして世界に平穏が訪れた...");
		}

	}

}
