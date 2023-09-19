package course40;

public class Practice02 {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
		String[] cities = {"東京", "大阪", "千葉", "神奈川", "埼玉笑"};
		int sum = 0;
		int hozu = 0;
		int[] mmm = {0,0,0,0,0};
		
		for (int x = 0; x < 5; x++) {
			mmm[x] = numbers[x];
		}
		
		for (int n = 0; n < 5; n++) {
			System.out.println(numbers[n]);
			sum = sum + numbers[n];
		}
		
		for (int n = 0; n < 5; n++) {
			System.out.println(cities[n]);
		}
		
		
		System.out.println(sum);
		
		for (int m = 0; m < 5; m++) {
			for (int m1 = 4; m1 > m; m1--) {
				if (mmm[m] > mmm[m1]) {
					hozu = mmm[m];
					mmm[m] = mmm[m1];
					mmm[m1] = hozu;
				}
			}
		}
		
		System.out.println(mmm[4]);
		
	}

}
