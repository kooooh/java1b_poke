package game;

//手持ちのポケトンを見る
import java.util.Random;

public class Trainer {
	static int hiki = 0;
	Random rnd = new Random();
	String name;
	Pocketon[] myPockes = new Pocketon[6];

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {
		Pocketon poo = new Pocketon(pocke.name , pocke.type , pocke.power , pocke.difficult);
		int r = rnd.nextInt(10) + 1;
		int nannido = pocke.difficult;
		
		if (r > nannido) {
			myPockes[hiki] = poo;
			pocke.getted = hiki;
			hiki++;
			System.out.println("ぽんけもんゲットだぜ！！");
		} else {
			System.out.println("ボールから出てきてしまった！！");
			System.out.println("捕獲失敗！！");
		}
	}

	void display() {
		System.out.println("今持っているポンケモンは、");
		for (int n = 0; n < 6; n++) {
			if (myPockes[n] != null) {
				System.out.println((n + 1) + "." + myPockes[n].name);
			} else {
				break;
			}
		}
		System.out.println("です。");
	}
}
