package templatem;

public class Main {

	public static void main(String[] args) {

		CombinableHeader android = new Android();
		
		CombinableHeader robot = new Robot();
		
		android.create();
		
		robot.create();
		
	}

}
