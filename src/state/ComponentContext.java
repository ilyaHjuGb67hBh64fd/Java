package state;

public class ComponentContext implements ComponentState{

	private ComponentState state;

	public ComponentState getState() {
		return state;
	};
	
	public void setState(ComponentState state) {
		
		this.state = state;
		
	}

	@Override
	public void createAction() {
		
		this.state.createAction();
		
	}
	
}
