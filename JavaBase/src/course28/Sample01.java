package course28;

public class Sample01 {

	public static void main(String[] args) {
		
		//インスタンス
		//「hu1」はHumanのインスタンス（実体）
		//インスタンスに対してパラメータを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		
		hu1.HP = 50;
		hu1.neru();
		
		System.out.println(hu1.name);
		
		
		//Chrクラスのインスタンス「numata」を生成。
		//attck def spd love mp hpに好きなパラメータを設定してみよう。
		Chr numata = new Chr();
		numata.attack = 300;
		numata.def = 25;
		numata.spd = 25;
		numata.love = -100;
		numata.mp = 150;
		numata.hp = 100;
		
		
		//インスタンス「touya」
		Chr kajima = new Chr();
		kajima.attack = 250;
		kajima.def = 100;
		kajima.spd = 150;
		kajima.love = -200;
		kajima.mp = 0;
		kajima.hp = 200;
		
		
		kajima.naguru(kajima.attack, numata.def);
	}

}
