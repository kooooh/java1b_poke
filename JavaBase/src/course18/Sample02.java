package course18;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/**]
		 * YESかNOを扱うboolean型もある。
		 * YESをTrue、NOをFalseと言い表す。
		 */
		boolean x = true;
		
		boolean y = false;
		
		//if文はかっこの中がTRUEかどうかを判定する。
		if(x) {
			System.out.println("TRUEだよ");
		} else {
			System.out.println("FALSEだよ");
		}
		
		//今までやってきた比較も最終的にはTRUEかFALSEでしかない。
		int i = 30;
		boolean z = i > 15;
		if(z) {
			System.out.println("iは15よりも大きいです");
		} else {
			System.out.println("iは15以下です");
		}
	}

}
