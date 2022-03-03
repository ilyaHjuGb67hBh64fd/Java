package facade;

public class Facade {

	SubscriberOne subOne = new SubscriberOne();
	SubscriberTwo subTwo = new SubscriberTwo();
	SubscriberThree subThree = new SubscriberThree();
	
	public void publish() {
		
		subOne.getPublishInfo();
		subTwo.getPublishInfo();
		subThree.getPublishInfo();
		
	}
}
