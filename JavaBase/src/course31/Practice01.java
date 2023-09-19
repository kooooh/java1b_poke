package course31;

public class Practice01 {

	public static void main(String[] args) {
		
		Books hon = new Books("初期ネーム", 100, "初期太郎");
		hon.display();
		
		hon.name = "ITワールド";
		hon.page = 500000;
		hon.author = "サーティファイ";
		
		hon.display();
	}

}
