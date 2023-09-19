package course29;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		Character me = new Character();
		System.out.println("プレイヤー1のパラメータを入力してね");
		System.out.println("名前は？");
		me.name = stdIn.next();
		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃力は？");
		me.str = stdIn.nextInt();
		System.out.println("防御力は？");
		me.def = stdIn.nextInt();
		System.out.println("命中率は？");
		me.dex = stdIn.nextInt();
		System.out.println("回避率は？");
		me.agi = stdIn.nextInt();
		
		Character tonari = new Character();
		tonari.name = "沼田先生";
		tonari.hp = 300;
		tonari.str = 200;
		tonari.def = 40;
		tonari.dex = 50;
		tonari.agi = 60;
		
		
		me.viewStatus();
		tonari.viewStatus();
		me.battle(me , tonari);
	}

}
