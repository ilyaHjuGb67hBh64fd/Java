package observer;

public class ClientOne implements MessageImpl{

	@Override
	public void sendMessage(String message) {
		
	System.out.println(message + " from " + this.getClass().getName());	
	
	}

	
}
