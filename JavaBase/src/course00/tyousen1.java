package course00;


import java.util.Scanner;

public class tyousen1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn = new Scanner(System.in);
		
		String a = "Aさん";
		String b = "Bさん";
		String c = "Cさん";
		String d = "Dさん";
		String e = "Eさん";
		String f = "Fさん";
		String namae = "あなたが思い浮かべたのは";
		
		System.out.println("性別は？");
		String q1 = stdIn.next();
		
		System.out.println("職業は？");
		String q2 = stdIn.next();
		

		if(q1.equals ("男性")) {
			if (q2.equals("営業職")){
				System.out.println("魚は好き？");
				String q3 = stdIn.next();
				if (!(q3.equals("魚は好き"))) {
					System.out.println("嫌いなら肉は好き？");
					String q4 = stdIn.next();
					if(q4.equals( "好き")) {
						System.out.println(namae + c + "です");
					}else {
						System.out.println(namae + a + "です");
					}
				}
			}else {
				System.out.println(namae + b + "です");
			}
			
			
		} else if (q2.equals("営業職")) {
			System.out.println(namae + f + "です");
			
		}else {
			System.out.println("猫と犬どっちが好き？");
			String q6 = stdIn.next();
			if (q6.equals("犬")) {
				System.out.println(namae + d + "です");
			}else {
				System.out.println(namae + e + "です");
			}

		}
		
		
		
	}

}
