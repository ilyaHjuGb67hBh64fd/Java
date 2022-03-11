package templatem;

public abstract class CombinableHeader {

	public void create() {
		combine();
		System.out.println("Hands");
		System.out.println("Body");
		System.out.println("Legs \n");
	}

	abstract public void combine();
}
