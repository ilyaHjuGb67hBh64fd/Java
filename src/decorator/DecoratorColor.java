package decorator;

public class DecoratorColor extends Decorator {

	public DecoratorColor(ShapeIml shape) {
		super(shape);
	}

	@Override
	public void addFilter() {
		System.out.println(" added Border ");
	}
	
}
