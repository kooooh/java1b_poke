package course11;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 0;

		while (i <= 100) {
			System.out.println("今は" + i + "です");
			if (i % 10 == 0 && !(i < 10)) {
				System.out.println("10の倍数です");
			}
			i++;
		}

	}

}
