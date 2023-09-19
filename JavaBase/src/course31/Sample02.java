package course31;

public class Sample02 {

	public static void main(String[] args) {
		
		Books[] arr = new Books[3];
		
		Books book1 = new Books("ITワールド",100,"サーティファイ");
		Books book2 = new Books("明解Java" , 400 , "柴田望洋");
		
		arr[0] = book1;
		arr[1] = book2;
		
		//配列にしまったインスタンスを呼び出すときは
		//以下のように書く。
		System.out.println(arr[1].name);
		
		for (int i = 0; i < 2; i++) {
			arr[i].display();
		}
	}

}
