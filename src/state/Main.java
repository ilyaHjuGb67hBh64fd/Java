package state;

public class Main {

	public static void main(String[] args) {
		
		ComponentContext context = new ComponentContext();
		
		ComponentState work = new WorkState();
		ComponentState stop = new StopState();
		ComponentState rest = new RestState();
		
		context.setState(rest);
		context.createAction();
		
		context.setState(work);
		context.createAction();
		
		context.setState(stop);
		context.createAction();
		
	}

}
