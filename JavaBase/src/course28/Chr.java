package course28;

public class Chr {
	
	
	static String school;
	int attack;
	int def;
	int spd;
	int love;
	int mp;
	int hp;
	
	static void naguru(int naguruAttack , int nagurareDef) {
		System.out.println((naguruAttack - nagurareDef) + "のダメージを与えた!");
		System.out.println(naguruAttack);
		System.out.println(nagurareDef);
	}
	
	void mamoru() {
		System.out.println("守りを固めて防御が" + (def * 2) + "になった。");
	}
}
