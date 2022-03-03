package adapter;

import java.util.ArrayList;
import java.util.List;

public class Manu {

	public static void main(String[] args) {
		
		List<String> port = new ArrayList<>();
		port.add("6010");
		port.add("6011");
		port.add("6012");
		port.add("6013");
		
		Adapter adapter = new Adapter();
		adapter.connect(port);
		
	}

}
