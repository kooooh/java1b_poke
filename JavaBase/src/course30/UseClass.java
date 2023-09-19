package course30;
import java.util.Scanner;
public class UseClass {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		Drink afternoonTea = new Drink(100,"初期データ");
		afternoonTea.display();
		afternoonTea.price = 150;
		afternoonTea.name = "午後の紅茶";
		System.out.println("数量を入力してください。");
		afternoonTea.suryo = stdIn.nextInt();
		
		afternoonTea.display();
		int sum = afternoonTea.calcSum(afternoonTea.price, afternoonTea.suryo);
		System.out.println("合計は" + sum + "円です。");
	}

}
