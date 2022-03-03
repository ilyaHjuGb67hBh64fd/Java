package decorator;

public class DecoratorBorder extends Decorator {

	public DecoratorBorder(ShapeIml shape) {
		super(shape);
	}

	@Override
	public void addFilter() {
		System.out.println(" added Color");
	}

}
