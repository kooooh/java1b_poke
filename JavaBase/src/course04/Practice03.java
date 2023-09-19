package course04;

public class Practice03 {
	public static void main(String[] args) {
		//応用00
		String a1 = "33、";
		String b1 = "26、";
		String c1 = "41、";
		String d1 = "41、";
		
		String moji = "1Aの学生は";
		
		System.out.println(moji + a1 + "1Bは" + b1 + "1Cは" + c1 + "1Dは" + d1 + "です");
		
		
		int ouyou1 = 10;
		int ouyou2 = 20;
		int ouyou3 = 30;
		String ten = "、";
		int ouyou4 = ouyou1 + ouyou2 + ouyou3;
		int ouyou5 = (ouyou1 + ouyou2 + ouyou3) / 3;
		
		System.out.println(ouyou1 + ten + ouyou2 + ten + ouyou3 + "の合計値は" + ouyou4 + ten + "平均値は" + ouyou5);
		
		
		System.out.println(ouyou1 + ten + ouyou2 + ten + ouyou3 + "の合計値は" + (ouyou1 + ouyou2 + ouyou3) + ten + "平均値は" + ((ouyou1 + ouyou2 + ouyou3) / 3));
	}
}
