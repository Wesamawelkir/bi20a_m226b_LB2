import java.util.ArrayList;

public class NewsFeed {
	
	
	private ArrayList<MessagePost> messages;
	private ArrayList<PhotoPost> photos;
	private ArrayList<EventPost> events;
	
	
	public NewsFeed() {
		
		messages = new ArrayList<>();
		photos = new ArrayList<>();
	}
	
	
	public void addMessagePost(MessagePost message) {
		messages.add(message);
	}
	
	public void addPhotoPost(PhotoPost photo) {
		photos.add(photo);
	}

	public void addEventPost(EventPost events) {events.add(events)}
	
	public void show() {
		
		for(MessagePost message : messages) {
			message.display();
			System.out.println();
		}
		
		for(PhotoPost photo : photos) {
			photo.display();
			System.out.println();
		}

		for(EventPost events : events) {
			events.display();
			System.out.println();
		}
		
	}

}
