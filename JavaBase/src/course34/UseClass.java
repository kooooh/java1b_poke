package course34;

public class UseClass {

	public static void main(String[] args) {
		
		Product pro1 = new Product();
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		
		pro1.display();
		
		Food ggg = new Food();
		
		ggg.display();
		
		ggg.name = "生茶";
		ggg.price = 100;
		
		ggg.display();
		
		
	}

}
