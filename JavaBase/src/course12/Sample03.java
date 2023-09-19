package course12;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int x = 1;
		int y = 1;
		while (x <= 9) {
			while (y <= 9) {
				System.out.print(x * y + ",");
				y++;
			}
			y = 1;
			x++;
			System.out.println("");
		}

	}

}
