package course31;

public class Books {
	
	String name;
	int page;
	String author;
	
	Books(String n, int p, String a){
		name = n;
		page = p;
		author = a;
		
	}
	
	void display() {
		System.out.println("名前：" + name);
		System.out.println("ページ：" + page);
		System.out.println("著者：" + author);
	}
	
	
}
