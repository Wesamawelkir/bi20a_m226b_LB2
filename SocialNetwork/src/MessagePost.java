import java.util.ArrayList;

/**
 * This class stores information about a post in a social network.
 * The main attribute is the message, however it also stores some other data such
 * as the author, possible comments and likes.
 *
 * @author based on example in ObjectsFirst
 *
 */


public class MessagePost extends Post {
	private String username;
	private String message;

	/**
	 * Constructor for objects of class MessagePost
	 * @param author
	 * @param text
	 */
	public MessagePost(String author, String text) {
		super();
		username= author;
		message = text;
	}

	public String getText() {
		return message;
	}

	/**
	 * Displays details of post
	 */
	public void display() {

		System.out.println("Username " + username);
		System.out.println("Message " + message);
		System.out.println("Posted " + super.getTimeStamp());

		if (super.getLikes() > 0) {
			System.out.println(super.getLikes() + " people like this.");
		} else {
			System.out.println();
		}
		if (super.getComments().isEmpty()) {
			System.out.println("No Comments yet...");

		} else {
			System.out.println("   " + super.getComments().size() + " comment(s). Press C to view");
		}
	}

}