package course30;

public class Drink {
	int price;
	String name;
	int suryo;
	
	Drink(int p, String n){
		price = p;
		name = n;
	}
	void display() {
		
		System.out.print(name);
		System.out.println("：" + price + "円");
		
	}
	
	int calcSum(int x , int y) {
		int sum = x * y;
		return sum;
	}
}


