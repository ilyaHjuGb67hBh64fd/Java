package stratege;

public class Main {

	public static void main(String[] args) {

		SwitchAction switchAction = new SwitchAction();
		
//		 NullPointerException 
//		 action.swithcAction(null);
		
		switchAction.swithcAction(new Filesystem());
		
		switchAction.swithcAction(new Database());
	}

}
