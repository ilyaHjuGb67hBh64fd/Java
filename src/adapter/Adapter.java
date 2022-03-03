package adapter;

import java.util.List;

public class Adapter implements SocketImpl{

	Socket socket = new Socket();
	
	@Override
	public void connect(List<String> ports) {
		for (String port : ports) {
			socket.connect(port);
		}
	}
	
}
