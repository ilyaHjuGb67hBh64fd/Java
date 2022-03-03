package observer;

public class Main {

	public static void main(String[] args) {

		ClientOne client1 = new ClientOne();
		ClientTwo client2 = new ClientTwo();
		
		Server server = new Server();
		server.addClient(client1);
		server.addClient(client2);
		
		server.createMessage(" \"Hello World\" ");
		
		
	}

}
