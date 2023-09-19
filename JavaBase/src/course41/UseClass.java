package course41;

public class UseClass {

	public static void main(String[] args) {

		Product pro1 = new Product();
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		pro1.display();

		Food foo = new Food();
		foo.name = "ごはんですよ";
		foo.price = 120;
		foo.display();

		Food[] menu = new Food[4];
		Food foo1 = new Food();
		Food foo2 = new Food();
		Food foo3 = new Food();
		Food foo4 = new Food();
		menu[0] = foo1;
		menu[1] = foo2;
		menu[2] = foo3;
		menu[3] = foo4;

		int hozu = 0;
		for (int n = 0; n < 4; n++) {
			for (int m = 3; m > n; m++) {
				if (menu[n].price < menu[m].price) {
					hozu = menu[n].price;
					menu[n].price = menu[m].price;
					menu[m].price = hozu;
				}
			}
		}
	}

}
