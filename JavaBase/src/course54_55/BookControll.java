package course54_55;

public class BookControll {

	public static void main(String[] args) {
		
		int[] arr = {10,11,12,13,14};
		
		System.out.println(arr[3]);
		
		Book book1 = new Book("明解Java" , 1500);
		System.out.println(book1.getPrice());
		
		Book book2 = new Book("VB" , 1200);
		
		Book book3 = new Book("ITパスポート" , 2500);
		
		Book book4 = new Book("C言語" , 2800);
		
		Book[] hondana = new Book[4];
		hondana[0] = book1;
	}

}
