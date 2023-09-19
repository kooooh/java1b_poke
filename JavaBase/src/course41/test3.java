package course41;

public class test3 {

	public static void main(String[] args) {

		mogi();

		calc(10, 11);

		String x = mojicon("今のところ全問正解でしょ？");

	}

	static void mogi() {
		System.out.println("メソッド問題");
	}

	static void calc(int a, int b) {
		System.out.println(a + b);
	}
	
	static String mojicon(String moji) {
		String concated = moji + "を受け取りました";
		return concated;
	}

}
