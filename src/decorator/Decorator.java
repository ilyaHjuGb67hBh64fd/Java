package decorator;

public abstract class Decorator implements ShapeIml{

	protected ShapeIml shape;

	public Decorator(ShapeIml shape) {

		this.shape = shape;
	}
	
	public abstract void addFilter();

		@Override
		public void draw() {
			shape.draw();
			addFilter();
		}
		
	}

