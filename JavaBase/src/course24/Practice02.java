package course24;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int n = 30;
		String m = "引数だよー";
		int a = 50;
		int b = 40;
		int tensu = 100;
		
		
		bai(n);
		moji(m);
		niko(a , b);
		calledMethod(tensu);
		
	}
	
	static void bai(int m) {
		m = m * 2;
		System.out.println(m);
	}
	
	static void moji(String n) {
		System.out.println(n);
	}
	
	static void niko(int x, int y) {
		System.out.println(x + y);
	}
	
	static void calledMethod(int tensu) {
		System.out.println("引数で受け取った値は" + tensu + "です。");
	}
}
