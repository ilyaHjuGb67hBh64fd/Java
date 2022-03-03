package observer;

import java.util.ArrayList;

public interface Dispatcher {

	ArrayList<MessageImpl> getListMassage();
	
	void addClient(MessageImpl messeges);
	
	void removeMessage(MessageImpl message);
	
	public void notifyAll(String message);
	
}
