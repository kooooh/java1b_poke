package game;

//ポケトン同士をバトルさせる
public class Battle {

	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		int v1;
		int v2;
		if (poke1.type.equals("火")) {
			v1 = 4;
		} else if (poke1.type.equals("草")) {
			v1 = 3;
		} else if (poke1.type.equals("地面")) {
			v1 = 2;
		} else {
			v1 = 1;
		}

		if (poke2.type.equals("火")) {
			v2 = 4;
		} else if (poke2.type.equals("草")) {
			v2 = 3;
		} else if (poke2.type.equals("地面")) {
			v2 = 2;
		} else {
			v2 = 1;
		}

		if (v1 - v2 == 1 && !(v1 == 1)) {
			poke1.power = poke1.power * 2;
		} else if (v1 == 1 && v2 == 4) {
			poke1.power = poke1.power * 2;
		} else if (v2 - v1 == 1) {
			poke2.power = poke2.power * 2;
		} else if (v2 == 1 && v1 == 4) {
			poke1.power = poke1.power * 2;
		}

		if (poke1.power > poke2.power) {
			winner = poke1.name;
		} else if (poke1.power < poke2.power) {
			winner = poke2.name;
		} else {
			winner = "ドロー";
		}
		return winner;
	}

}
