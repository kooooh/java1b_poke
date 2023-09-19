package course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	//デフォルトコンストラクタ
	public Typhoon(){
		
	}
	
	//引数有りコンストラクタ
	public Typhoon(int t , String h , String a) {
		this.typhoonbango = t;
		this.hasseibi = h;
		this.asiaName = a;
		if(!(hasseibi.equals(""))) {
			System.out.println(typhoonbango + "." + hasseibi + "　" + asiaName);
		}
	}
	
	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}
	public String getHasseibi() {
		return hasseibi;
	}
	public String getAsiaName() {
		return asiaName;
	}
	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}
	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}
	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
}
