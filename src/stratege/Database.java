package stratege;

public class Database implements Checker{

	private boolean state;

	@Override
	public boolean checkerAction(boolean state) {
		
		this.setState(state);
		System.out.println(state);
		
		return state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	

}
