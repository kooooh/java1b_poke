package course36;

public class kaden {
	
	private String name;
	static int price;
	
	kaden(){
		name = "初期名";
		price = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getPrice() {
		return price;
	}
	
	public static void setPrice(int price) {
		kaden.price = price;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(price);
	}
	
}
