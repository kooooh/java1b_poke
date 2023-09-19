package course19;

public class Sample19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String x = "いとうこうせい";
		String y = "いのるうき";
		String z = "かけがわこうき";
		String xx = "すずきれいや";
		String yy = "いとうそら";
		String zz = "さかもと";
		String xxx = "やすだ";
		String yyy = "だれ？";

		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "やすだ";
		nameList[1] = "ねもと";
		nameList[2] = "ながなわ";
		nameList[3] = "ながなわ";
		nameList[4] = "ながなわ";
		nameList[5] = "ながなわ";
		nameList[6] = "ながなわ";
		nameList[7] = "ながなわ";

		for (int i = 0; i < 3; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}

	}

}
