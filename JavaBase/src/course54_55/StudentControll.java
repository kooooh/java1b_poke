package course54_55;

public class StudentControll {

	public static void main(String[] args) {
		
		Student tonari = new Student(24,"藤平陸仁");
		Student me = new Student(8,"掛川孝己");
		
		Student[] mymen = {tonari , me};
		System.out.println(mymen[1].getName());
		mymen[0].setName("なわ");
		System.out.println(mymen[0].getName());
	}

}
