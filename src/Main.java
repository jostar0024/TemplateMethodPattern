
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstractCalculater intCal = new IntCalculater(10);
		AbstractCalculater doubleCal = new DoubleCalculater(10.1);
		intCal.show();
		doubleCal.show();
	}

}
