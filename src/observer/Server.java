package observer;

import java.util.ArrayList;

public class Server implements Dispatcher {

	ArrayList<MessageImpl> messages = new ArrayList<>();
	
	@Override
	public ArrayList<MessageImpl> getListMassage() {
		return messages;
	}

	@Override
	public void addClient(MessageImpl message) {
		messages.add(message);
	}

	@Override
	public void removeMessage(MessageImpl message) {
		messages.remove(message);
	}

	@Override
	public void notifyAll(String message) {
		for (MessageImpl m : messages) {
			m.sendMessage(message);
		}
	}
	
	public void createMessage(String message) {
		System.out.println("New message" + message);
		notifyAll(message);
	}
	
	
	
}
