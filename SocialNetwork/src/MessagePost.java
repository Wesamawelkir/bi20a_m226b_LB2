import java.util.ArrayList;



public class MessagePost  extends Post {
	

	private String message;


	public MessagePost(String author, String text) {
		
		username= author;
		message = text;
		timestamp = System.currentTimeMillis();
		likes = 0;
		comments = new ArrayList<>();
	}

	
	public String getText() {
		return message;
	}

	/**
	 * Displays details of post
	 */

}
