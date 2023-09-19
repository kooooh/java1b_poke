package course25;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num = modoriOne(134);
		System.out.println(num);
		
		String moji = modoriTwo("文字！");
		System.out.println(moji);
		
		int z = modoPraThree(333, 555);
		System.out.println(z);
		
	}
	
	static int modoriOne(int a) {
		a = a + 100;
		return a;
	}
	
	static String modoriTwo(String b) {
		b = b + "を受け取りました";
		return b;
	}
	
	static int modoPraThree(int x , int y) {
		int sum = x + y;
		return sum;
	}

}
