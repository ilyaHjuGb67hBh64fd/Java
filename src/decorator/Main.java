package decorator;

public class Main {

	public static void main(String[] args) {

		System.out.println(" start ");
		
		ShapeIml shape = new DecoratorColor(new Rectangle());
		shape.draw();
		
		System.out.println(" end ");
		
		System.out.println("start");
		
		ShapeIml shape2 = new DecoratorBorder(new DecoratorColor(new Rectangle()));
		shape2.draw();

		System.out.println(" end ");
		
		System.out.println("start");
		
		ShapeIml shape3 = new DecoratorColor(shape);
		shape3.draw();
		
		System.out.println(" end ");
	}
}
