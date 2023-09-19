package course11;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int c = 1;
		String x = "*";
		while (c <= 7) {
			System.out.println(x);
			c++;
			if (c < 5) {
				x = x + "*";
			} else if (c == 5) {
				x = "***";
			} else if (c == 6) {
				x = "**";
			} else if (c == 7) {
				x = "*";
			}
		}

	}
}